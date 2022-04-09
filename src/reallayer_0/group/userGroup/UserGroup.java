package reallayer_0.group.userGroup;

import advancelayer_1.result.Result;
import reallayer_0.user.types.UserInterface;
import reallayer_0.user.infos.UsernameInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 类名:     UserGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class UserGroup implements UserGroupInterface {
    protected final TreeMap<UsernameInterface, UserInterface> nameToUser;
    private final String groupname;

    public UserGroup(String groupname) {
        this.groupname = groupname;
        this.nameToUser = new TreeMap<>();
    }

    @Override
    public boolean insertUser(UserInterface user) {
        if (nameToUser.containsKey(user.getUsername())) {
            return false;
        }
        nameToUser.put(user.getUsername(), user);
        return true;
    }

    @Override
    public boolean containsUser(UsernameInterface username) {
        return nameToUser.containsKey(username);
    }

    @Override
    public boolean deleteUser(UserInterface user) {
        if (nameToUser.containsKey(user.getUsername())) {
            nameToUser.remove(user.getUsername());
            return true;
        }
        return false;
    }

    protected UserInterface realGetUser(UsernameInterface usernameInterface) {
        return nameToUser.get(usernameInterface);
    }

    @Override
    public String groupname() {
        return groupname;
    }

    @Override
    public int compareTo(UserGroupInterface o) {
        return this.groupname.compareTo(o.groupname());
    }

//    使用 子类 AdvanceGroupInterface 的迭代器 迭代 AdvanceUserInterface
//    public Iterator<UserInterface> iterator() {
//        return new Iterator<>() {
//            private final Iterator<UsernameInterface> keyIterator = nameToUser.keySet().iterator();
//
//            @Override
//            public boolean hasNext() {
//                return keyIterator.hasNext();
//            }
//
//            @Override
//            public UserInterface next() {
//                return nameToUser.get(keyIterator.next());
//            }
//        };
//    }

    @Override
    public Result<TreeSet<UserInterface>> userlist() {
        return new Result<>(new TreeSet<>(nameToUser.values()));
    }
}
