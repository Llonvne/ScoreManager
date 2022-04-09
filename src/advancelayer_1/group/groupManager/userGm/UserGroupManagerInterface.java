package advancelayer_1.group.groupManager.userGm;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;

import java.util.TreeSet;

public interface UserGroupManagerInterface {
    AdvanceUserInterface getUser();
    boolean attentGroup(AdvanceGroupInterface advanceGroup);
    boolean leaveGroup(AdvanceGroupInterface advanceGroup);
    boolean isInGroup(AdvanceGroupInterface advance);
    Result<AdvanceGroupInterface> searchGroup(String groupname);

    TreeSet<AdvanceGroupInterface> groupList();
}
