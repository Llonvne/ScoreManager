package reallayer_0.group.studentGroup;

import reallayer_0.group.userGroup.UserGroup;
import reallayer_0.records.scoreManager.ScoreManager;
import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.user.types.StudentInterface;

import java.util.TreeMap;

/**
 * 类名:     StudentGroup
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class StudentGroup extends UserGroup implements StudentGroupInterface {
    protected TreeMap<StudentInterface, ScoreManagerInterface> studentToScoreManager;

    public StudentGroup(String groupname) {
        super(groupname);
        studentToScoreManager = new TreeMap<>();
    }

    @Override
    public ScoreManagerInterface getStudentScoreManager(StudentInterface student) {
        if (super.containsUser(student.getUsername())) {
            if (studentToScoreManager.get(student) == null){
                studentToScoreManager.put(student,new ScoreManager(student));
            }
            return studentToScoreManager.get(student);
        }
        return null;
    }
}
