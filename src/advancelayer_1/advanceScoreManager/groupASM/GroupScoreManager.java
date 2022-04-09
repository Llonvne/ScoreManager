package advancelayer_1.advanceScoreManager.groupASM;

import advancelayer_1.advanceScoreManager.advanceScoreManager.AdvanceScoreManager;
import advancelayer_1.advanceScoreManager.advanceScoreManager.AdvanceScoreManagerInterface;
import advancelayer_1.user.AdvanceUser;
import advancelayer_1.user.AdvanceUserInterface;

import java.util.TreeMap;

/**
 * 类名:     GroupScoreManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class GroupScoreManager implements GroupScoreManagerInterface{
    private TreeMap<AdvanceUserInterface, AdvanceScoreManagerInterface> userToScoreManager;
    public GroupScoreManager(){
        userToScoreManager = new TreeMap<>();
    }

    @Override
    public AdvanceScoreManagerInterface getUserScoreManager(AdvanceUser user) {
        if (userToScoreManager.containsKey(user)){
            userToScoreManager.put(user,new AdvanceScoreManager(user));
        }
        return userToScoreManager.get(user);
    }
}
