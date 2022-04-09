package runtimelayer_3.runtime;

import runtimelayer_3.RuntimeCenterGroupManager.RuntimeCenterGroupManager;
import runtimelayer_3.RuntimeCenterGroupManager.RuntimeCenterGroupManagerInterface;
import runtimelayer_3.runtimeUserGroup.RuntimeDefaultUserGroup;

/**
 * 类名:     Runtime
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class ScoreManagerRuntime implements RuntimeInterface{
    public final RuntimeDefaultUserGroup defaultUserGroup = new RuntimeDefaultUserGroup();
    public final RuntimeCenterGroupManagerInterface centerGroupManager = new RuntimeCenterGroupManager();
}
