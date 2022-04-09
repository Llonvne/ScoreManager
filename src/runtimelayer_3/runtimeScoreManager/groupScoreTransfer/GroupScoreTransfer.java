package runtimelayer_3.runtimeScoreManager.groupScoreTransfer;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.records.score.ScoreInterface;

import java.util.TreeMap;
import java.util.Vector;

/**
 * 类名:     groupScoreTransfer
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class GroupScoreTransfer implements GroupScoreTransferInterface {
    private final AdvanceGroupInterface group;
    private final TreeMap<AdvanceUserInterface,Vector<ScoreInterface>> scores;
    public GroupScoreTransfer(AdvanceGroupInterface group) {
        this.group = group;
        this.scores = new TreeMap<>();
    }
    public void submitScoreToGroup (TreeMap<AdvanceUserInterface, ScoreInterface> scores){
        for (AdvanceUserInterface user : scores.keySet()){
            if (group.containsUser(user.getUsername())){
                if (!this.scores.containsKey(user)){
                    this.scores.put(user, new Vector<>());
                }
                this.scores.get(user).add(scores.get(user));
            }
        }
    }

    @Override
    public AdvanceGroupInterface getGroup() {
        return group;
    }
}
