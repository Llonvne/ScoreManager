package advancelayer_1.group.groupManager.userGm;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 类名:     GroupManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class UserGroupManager implements UserGroupManagerInterface,Comparable<UserGroupManager> {
    private final TreeMap<String, AdvanceGroupInterface> nameToGroupMap;
    private AdvanceUserInterface user = null;

    public UserGroupManager(AdvanceUserInterface user) {
        nameToGroupMap = new TreeMap<>();
        this.user = user;
    }

    @Override
    public AdvanceUserInterface getUser() {
        return user;
    }

    @Override
    public boolean attentGroup(AdvanceGroupInterface advanceGroup) {
        if (isInGroup(advanceGroup)) {
            return false;
        }
        nameToGroupMap.put(advanceGroup.groupname(), advanceGroup);
        return true;
    }

    @Override
    public boolean leaveGroup(AdvanceGroupInterface advanceGroup) {
        if (!isInGroup(advanceGroup)) {
            return false;
        }
        nameToGroupMap.remove(advanceGroup.groupname());
        return true;
    }

    @Override
    public boolean isInGroup(AdvanceGroupInterface advance) {
        return nameToGroupMap.containsKey(advance.groupname());
    }

    @Override
    public Result<AdvanceGroupInterface> searchGroup(String groupname) {
        return new Result<>(nameToGroupMap.get(groupname));
    }

    @Override
    public TreeSet<AdvanceGroupInterface> groupList() {
        return (TreeSet<AdvanceGroupInterface>) nameToGroupMap.values();
    }

    @Override
    public int compareTo(UserGroupManager o) {
        return this.user.compareTo(o.user);
    }
}
