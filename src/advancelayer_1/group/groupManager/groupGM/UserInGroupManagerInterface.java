package advancelayer_1.group.groupManager.groupGM;

import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.group.userGroup.UserlistInterface;
import reallayer_0.user.infos.UsernameInterface;


public interface UserInGroupManagerInterface extends UserlistInterface {
    AdvanceGroupInterface getGroup();

    boolean userAttend(AdvanceUserInterface user);

    boolean userLeave(AdvanceUserInterface user);

    boolean isUserIn(AdvanceUserInterface user);

    Result<AdvanceUserInterface> searchUserIn(UsernameInterface name);
}
