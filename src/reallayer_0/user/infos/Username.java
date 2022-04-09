package reallayer_0.user.infos;

/**
 * 类名:     Username
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Username implements UsernameInterface {
    private final String username;

    public Username(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(UsernameInterface o) {
        return this.username.compareTo(o.toString());
    }

    public String toString() {
        return username;
    }
}
