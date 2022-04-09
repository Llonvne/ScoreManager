package runtimelayer_3.runtimeUserGroup;

import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.group.userGroup.UserlistInterface;
import reallayer_0.user.infos.UsernameInterface;
import reallayer_0.user.types.UserInterface;

import java.util.TreeSet;



public interface RuntimeDefaultUserGroupInterface extends UserlistInterface {
    boolean isUserIn(UsernameInterface username);
    boolean createUser(String username);
    boolean deleteUser(AdvanceUserInterface user);

    Result<AdvanceUserInterface> getUser(UsernameInterface username);

    Result<TreeSet<UserInterface>> userlist();
}
