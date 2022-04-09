package advancelayer_1.group.advanceGroup;

import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.group.userGroup.UserGroupInterface;
import reallayer_0.user.infos.UsernameInterface;

public interface AdvanceGroupInterface extends UserGroupInterface,Iterable<AdvanceUserInterface>{
    Result<AdvanceUserInterface> getUser(UsernameInterface usernameInterface);
}
