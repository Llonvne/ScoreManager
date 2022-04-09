package advancelayer_1.group.defaultUserGroup;

import advancelayer_1.group.advanceGroup.AdvanceGroup;

/**
 * 类名:     DefaultUserGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class DefaultUserGroup extends AdvanceGroup implements DefaultUserGroupInterface {
    private static DefaultUserGroupInterface defaultUserGroup = null;
    private static final String DEFAULT_USER_GROUP_NAME = "全体用户组";

    private DefaultUserGroup() {
        super(DEFAULT_USER_GROUP_NAME);
    }

    public static DefaultUserGroupInterface getDefaultUserGroup() {
        if (defaultUserGroup == null) {
            defaultUserGroup = new DefaultUserGroup();
        }
        return defaultUserGroup;
    }
}
