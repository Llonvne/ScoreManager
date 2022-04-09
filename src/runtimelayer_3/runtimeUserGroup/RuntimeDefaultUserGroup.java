package runtimelayer_3.runtimeUserGroup;

import advancelayer_1.group.defaultUserGroup.DefaultUserGroup;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUser;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.user.infos.UsernameInterface;
import reallayer_0.user.types.UserInterface;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 类名:     RuntimeDefaultUserGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RuntimeDefaultUserGroup implements RuntimeDefaultUserGroupInterface,Iterable<AdvanceUserInterface>{
    @Override
    public boolean isUserIn(UsernameInterface username) {
        return DefaultUserGroup.getDefaultUserGroup().containsUser(username);
    }

    @Override
    public boolean createUser(String username) {
        return DefaultUserGroup.getDefaultUserGroup().insertUser(new AdvanceUser(username));
    }

    @Override
    public boolean deleteUser(AdvanceUserInterface user) {
        return DefaultUserGroup.getDefaultUserGroup().deleteUser(user);
    }

    @Override
    public Result<AdvanceUserInterface> getUser(UsernameInterface username) {
        return DefaultUserGroup.getDefaultUserGroup().getUser(username);
    }

    @Override
    public Result<TreeSet<UserInterface>> userlist() {
        return DefaultUserGroup.getDefaultUserGroup().userlist();
    }

    @Override
    public Iterator<AdvanceUserInterface> iterator() {
        return new Iterator<>() {
            private final Iterator<AdvanceUserInterface> userIter = DefaultUserGroup.getDefaultUserGroup().iterator();

            @Override
            public boolean hasNext() {
                return userIter.hasNext();
            }

            @Override
            public AdvanceUserInterface next() {
                return userIter.next();
            }
        };
    }
}
