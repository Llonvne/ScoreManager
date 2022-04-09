package runtimelayer_3.runtimeScoreManager;

import advancelayer_1.advanceScoreManager.groupASM.GroupScoreManager;
import advancelayer_1.advanceScoreManager.groupASM.GroupScoreManagerInterface;

/**
 * 类名:     RuntimeScoreManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RuntimeScoreManager implements RuntimeScoreManagerInterface{
    private final static GroupScoreManagerInterface groupScoreManager = new GroupScoreManager();
}
