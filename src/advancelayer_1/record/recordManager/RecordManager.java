package advancelayer_1.record.recordManager;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.record.groupRecordManager.GroupRecordManager;
import advancelayer_1.record.groupRecordManager.GroupRecordManagerInterface;
import advancelayer_1.result.Result;

import java.util.TreeMap;

/**
 * 类名:     RecordManager
 * 描述:
 * 隶属于:   ScoreManager
 * 建立事件： 2022/4/9
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RecordManager implements RecordManagerInterface{
    TreeMap<AdvanceGroupInterface,GroupRecordManagerInterface> groupToGroupRecord;
    @Override
    public Result<GroupRecordManagerInterface> getGroupRecordManager(AdvanceGroupInterface group) {
        if (!groupToGroupRecord.containsKey(group)){
            groupToGroupRecord.put(group,new GroupRecordManager(group));
        }
        return new Result<>(groupToGroupRecord.get(group));
    }
}
