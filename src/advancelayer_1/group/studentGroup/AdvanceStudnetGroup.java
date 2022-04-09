package advancelayer_1.group.studentGroup;

import advancelayer_1.result.Result;
import reallayer_0.group.studentGroup.StudentGroup;
import reallayer_0.records.scoreManager.ScoreManager;
import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.user.types.StudentInterface;

/**
 * 类名:     AdvanceStudnetGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class AdvanceStudnetGroup extends StudentGroup implements AdvanceStudentGroupInterface {
    public AdvanceStudnetGroup(String groupname) {
        super(groupname);
    }

    public Result<ScoreManagerInterface> safeGetStudentScoreManager(StudentInterface student) {
        if (super.containsUser(student.getUsername())) {
            if (super.studentToScoreManager.get(student) == null) {
                super.studentToScoreManager.put(student, new ScoreManager(student));
            }
            return new Result<>(true, super.studentToScoreManager.get(student));
        }
        return new Result<>(false, null);
    }
}
