package advancelayer_1.record.groupRecordManager;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.record.userRecordManager.UserRecordManager;
import advancelayer_1.record.userRecordManager.UserRecordManagerInterface;
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
public class GroupRecordManager implements GroupRecordManagerInterface {
    private final TreeMap<AdvanceUserInterface, UserRecordManagerInterface> userToScoreManager;
    private final AdvanceGroupInterface group;
    public GroupRecordManager(AdvanceGroupInterface group){
        userToScoreManager = new TreeMap<>();
        this.group = group;
    }

    @Override
    public AdvanceGroupInterface getGroup() {
        return group;
    }

    @Override
    public UserRecordManagerInterface getUserScoreManager(AdvanceUser user) {
        if (userToScoreManager.containsKey(user)){
            userToScoreManager.put(user,new UserRecordManager(user));
        }
        return userToScoreManager.get(user);
    }
}
