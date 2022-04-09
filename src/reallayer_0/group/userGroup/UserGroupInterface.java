package reallayer_0.group.userGroup;

import reallayer_0.user.types.UserInterface;
import reallayer_0.user.infos.UsernameInterface;


public interface UserGroupInterface extends Comparable<UserGroupInterface>, UserlistInterface{
    boolean insertUser(UserInterface user);

    boolean containsUser(UsernameInterface username);

    boolean deleteUser(UserInterface user);

    String groupname();
}
