package reallayer_0.records.subject;

/**
 * 类名:     Subject
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Subject implements SubjectInterface{
    private String subject;

    public Subject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String modifySubject() {
        this.subject = subject;
        return this.subject;
    }

    @Override
    public String toString() {
        return getSubject();
    }

    @Override
    public int compareTo(SubjectInterface o) {
        return subject.compareTo(o.getSubject());
    }
}
