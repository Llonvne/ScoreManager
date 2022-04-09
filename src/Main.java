import advancelayer_1.group.advanceGroup.AdvanceGroupInterface;
import advancelayer_1.result.Result;
import advancelayer_1.user.AdvanceUserInterface;
import reallayer_0.user.infos.Username;
import reallayer_0.user.types.UserInterface;
import runtimelayer_3.runtime.ScoreManagerRuntime;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        ScoreManagerRuntime runtime = new ScoreManagerRuntime();
        runtime.defaultUserGroup.createUser("Llonvne");
        runtime.defaultUserGroup.createUser("Lcosvle");

        AdvanceGroupInterface group = runtime.centerGroupManager.generateGroup("201").getResult();
        AdvanceUserInterface u1 = runtime.defaultUserGroup
                .getUser(new Username("Llonvne")).getResult();

        runtime.centerGroupManager.userAttendGroup(u1,group);
        for (UserInterface user : group){
            System.out.println(user.getUsername());
        }
    }
}
