package runtimelayer_3.RuntimeCenterGroupManager;

import advancelayer_1.group.advanceGroup.AdvanceGroup;
import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.group.groupManager.centerGM.CenterGroupManager;
import advancelayer_1.group.groupManager.centerGM.CenterGroupManagerInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 类名:     RuntimeCenterGroupManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RuntimeCenterGroupManager implements RuntimeCenterGroupManagerInterface {
    private static final TreeMap<String,AdvanceGroupInterface> nameToGroup = new TreeMap<>();
    private static final CenterGroupManagerInterface centerGM = new CenterGroupManager();
    @Override
    public Result<AdvanceGroupInterface> generateGroup(String groupname) {
        AdvanceGroup group = new AdvanceGroup(groupname);
        nameToGroup.put(groupname,group);
        return new Result<>(group);
    }

    @Override
    public boolean isHasGroup(String groupname) {
        return nameToGroup.containsKey(groupname);
    }

    @Override
    public Result<AdvanceGroupInterface> getUserGroup(String groupname) {
        return new Result<>(nameToGroup.get(groupname));
    }

    @Override
    public Result<TreeSet<AdvanceGroupInterface>> groupList() {
        TreeSet<AdvanceGroupInterface> res = new TreeSet<>(nameToGroup.values());
        return new Result<>(res);
    }

    @Override
    public boolean userAttendGroup(AdvanceUserInterface user, AdvanceGroupInterface group) {
        return centerGM.userAttendGroup(user,group);
    }
}
