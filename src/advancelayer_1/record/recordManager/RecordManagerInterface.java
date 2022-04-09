package advancelayer_1.record.recordManager;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.record.groupRecordManager.GroupRecordManagerInterface;
import advancelayer_1.result.Result;

public interface RecordManagerInterface {
    Result<GroupRecordManagerInterface> getGroupRecordManager(AdvanceGroupInterface group);
}
