package runtimelayer_3.runtimeRecordManager;

import advancelayer_1.record.recordManager.RecordManager;

/**
 * 类名:     RuntimeScoreManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RuntimeRecordManager implements RuntimeRecordManagerInterface  {
    private final static RecordManager recordManager = new RecordManager();

//    public boolean PraserGroupScoreTransfer(RecordTransfer groupScoreTransfer) {
//        Result<GroupRecordManagerInterface> groupRecord =
//                recordManager.getGroupRecordManager(groupScoreTransfer.getGroup());
//        if (!groupRecord.isOK()){
//            return false;
//        }
//        for (AdvanceUserInterface user : groupRecord.getResult()){
//
//        }
//    }
}
