package advancelayer_1.group.groupManager.groupGM;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.user.infos.UsernameInterface;
import reallayer_0.user.types.UserInterface;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 类名:     UserInGroupManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class UserInGroupManager implements UserInGroupManagerInterface,Comparable<UserInGroupManager> {
    private final AdvanceGroupInterface group;

    public UserInGroupManager(AdvanceGroupInterface group) {
        this.group = group;
    }

    @Override
    public AdvanceGroupInterface getGroup() {
        return this.group;
    }

    @Override
    public boolean userAttend(AdvanceUserInterface user) {
        if (isUserIn(user)) {
            return false;
        }
        group.insertUser(user);
        return true;
    }

    @Override
    public boolean userLeave(AdvanceUserInterface user) {
        if (isUserIn(user)) {
            group.deleteUser(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean isUserIn(AdvanceUserInterface user) {
        return group.containsUser(user.getUsername());
    }

    @Override
    public Result<AdvanceUserInterface> searchUserIn(UsernameInterface name) {
        return group.getUser(name);
    }

    @Override
    public int compareTo(UserInGroupManager o) {
        return this.group.compareTo(o.group);
    }

    @Override
    public Result<TreeSet<UserInterface>> userlist() {
        return group.userlist();
    }
}
