package advancelayer_1.group.advanceGroup;

import advancelayer_1.group.groupManager.centerGM.CenterGroupManager;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.group.userGroup.UserGroup;
import reallayer_0.user.infos.UsernameInterface;
import reallayer_0.user.types.UserInterface;
import runtimelayer_3.runtimeScoreManager.groupScoreTransfer.GroupScoreTransfer;

import java.util.Iterator;
import java.util.Set;

/**
 * 类名:     AdvanceGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class AdvanceGroup extends UserGroup implements AdvanceGroupInterface{
    public AdvanceGroup(String groupname) {
        super(groupname);
    }

    @Override
    public Result<AdvanceUserInterface> getUser(UsernameInterface usernameInterface) {
        AdvanceUserInterface result = (AdvanceUserInterface) super.realGetUser(usernameInterface);
        if (result == null){
            return new Result<>(false, null);
        }
        return new Result<>(true,result);
    }

    @Override
    public Iterator<AdvanceUserInterface> iterator() {
        return new Iterator<>() {
            private final Iterator<UserInterface> keyIterator = AdvanceGroup.super.nameToUser.values().iterator();
            @Override
            public boolean hasNext() {
                return keyIterator.hasNext();
            }

            @Override
            public AdvanceUserInterface next() {
                return (AdvanceUserInterface) keyIterator.next();
            }
        };
    }
}
