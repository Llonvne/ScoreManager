package runtimelayer_3.RuntimeCenterGroupManager;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUser;
import advancelayer_1.user.AdvanceUserInterface;

import java.util.TreeSet;

public interface RuntimeCenterGroupManagerInterface {
    Result<AdvanceGroupInterface> generateGroup(String groupname);

    boolean isHasGroup(String groupname);

    Result<AdvanceGroupInterface> getUserGroup(String groupname);

    Result<TreeSet<AdvanceGroupInterface>> groupList();

    boolean userAttendGroup(AdvanceUserInterface user, AdvanceGroupInterface group);
}
