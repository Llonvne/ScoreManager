package advancelayer_1.record.userRecordManager;

import advancelayer_1.result.Result;
import reallayer_0.records.score.ScoreInterface;
import reallayer_0.records.scoreManager.ScoreManager;
import reallayer_0.records.subject.SubjectInterface;
import reallayer_0.user.types.UserInterface;

/**
 * 类名:     AdvanceScoreManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class UserRecordManager extends ScoreManager implements UserRecordManagerInterface {
    public UserRecordManager(UserInterface user) {
        super(user);
    }

    @Override
    public Result<ScoreInterface> safeSearchScoreBySubject(SubjectInterface subject) {
        ScoreInterface result = searchScoreBySubject(subject);
        return new Result<>(result);
    }
}
