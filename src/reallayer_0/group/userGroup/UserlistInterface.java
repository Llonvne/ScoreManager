package reallayer_0.group.userGroup;

import advancelayer_1.result.Result;
import reallayer_0.user.types.UserInterface;

import java.util.TreeSet;

public interface UserlistInterface {
    Result<TreeSet<UserInterface>> userlist();
}
