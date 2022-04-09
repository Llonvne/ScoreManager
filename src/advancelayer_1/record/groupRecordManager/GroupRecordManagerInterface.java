package advancelayer_1.record.groupRecordManager;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.record.userRecordManager.UserRecordManagerInterface;
import advancelayer_1.user.AdvanceUser;

public interface GroupRecordManagerInterface {
    AdvanceGroupInterface getGroup();
    UserRecordManagerInterface getUserScoreManager(AdvanceUser user);
}
