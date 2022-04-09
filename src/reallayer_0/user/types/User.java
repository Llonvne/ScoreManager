package reallayer_0.user.types;

import reallayer_0.user.infos.Username;
import reallayer_0.user.infos.UsernameInterface;

/**
 * 类名:     User
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class User implements UserInterface{
    private final UsernameInterface username;
    public User(String username){
        this.username = new Username(username);
    }
    @Override
    public UsernameInterface getUsername() {
        return username;
    }

    @Override
    public int compareTo(UserInterface o) {
        return username.compareTo(o.getUsername());
    }
}
