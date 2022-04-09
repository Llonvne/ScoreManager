package advancelayer_1.group.groupManager.centerGM;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.group.groupManager.groupGM.UserInGroupManager;
import advancelayer_1.group.groupManager.groupGM.UserInGroupManagerInterface;
import advancelayer_1.group.groupManager.userGm.UserGroupManager;
import advancelayer_1.group.groupManager.userGm.UserGroupManagerInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.user.types.UserInterface;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 类名:     CenterGroupManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class CenterGroupManager implements CenterGroupManagerInterface{
    private final TreeMap<AdvanceUserInterface, UserGroupManagerInterface> userToUserGroupManager;
    private final TreeMap<AdvanceGroupInterface, UserInGroupManagerInterface> groupToUserInGroupManager;;

    public CenterGroupManager(){
        userToUserGroupManager = new TreeMap<>();
        groupToUserInGroupManager = new TreeMap<>();
    }
    @Override
    public boolean isUserInGroup(AdvanceUserInterface user, AdvanceGroupInterface group) {
        if (!groupToUserInGroupManager.containsKey(group)){
            return false;
        }
        return groupToUserInGroupManager.get(group).isUserIn(user);
    }

    @Override
    public boolean userLeaveGroup(AdvanceUserInterface user, AdvanceGroupInterface group) {
        if (!groupToUserInGroupManager.containsKey(group)){
            return false;
        }
        groupToUserInGroupManager.get(group).userLeave(user);
        if (!userToUserGroupManager.containsKey(user)){
            return false;
        }
        userToUserGroupManager.get(user).leaveGroup(group);
        return true;
    }

    @Override
    public boolean userAttendGroup(AdvanceUserInterface user, AdvanceGroupInterface group) {
        if (!userToUserGroupManager.containsKey(user)){
            userToUserGroupManager.put(user,new UserGroupManager(user));
        }
        if (!groupToUserInGroupManager.containsKey(group)){
            groupToUserInGroupManager.put(group,new UserInGroupManager(group));
        }
        userToUserGroupManager.get(user).attentGroup(group);
        groupToUserInGroupManager.get(group).userAttend(user);
        return true;
    }

    @Override
    public Result<TreeSet<AdvanceGroupInterface> > groupList(AdvanceUserInterface user) {
        if (!userToUserGroupManager.containsKey(user)){
            return new Result<>(null);
        }
        return new Result<>(userToUserGroupManager.get(user).groupList());
    }

    @Override
    public Result<TreeSet<UserInterface>> userList(AdvanceGroupInterface group) {
        if (!groupToUserInGroupManager.containsKey(group)){
            return new Result<>(null);
        }
        return group.userlist();
    }
}
