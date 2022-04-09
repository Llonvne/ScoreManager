package advancelayer_1.group.groupManager.centerGM;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.user.types.UserInterface;

import java.util.TreeSet;

public interface CenterGroupManagerInterface {
    boolean isUserInGroup(AdvanceUserInterface user, AdvanceGroupInterface group);
    boolean userLeaveGroup(AdvanceUserInterface user,AdvanceGroupInterface group);
    boolean userAttendGroup(AdvanceUserInterface user, AdvanceGroupInterface group);

    Result<TreeSet<AdvanceGroupInterface>> groupList(AdvanceUserInterface user);
    Result<TreeSet<UserInterface>> userList(AdvanceGroupInterface group);
}
