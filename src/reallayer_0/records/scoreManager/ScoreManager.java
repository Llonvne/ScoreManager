package reallayer_0.records.scoreManager;

import reallayer_0.records.score.ScoreInterface;
import reallayer_0.records.subject.SubjectInterface;
import reallayer_0.user.types.UserInterface;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * 类名:     ScoreManager
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class ScoreManager implements ScoreManagerInterface {
    private final UserInterface user;
    private final TreeMap<SubjectInterface, ScoreInterface> subjectToScore;

    public ScoreManager(UserInterface user) {
        this.user = user;
        subjectToScore = new TreeMap<>();
    }

    @Override
    public UserInterface getUser() {
        return user;
    }

    @Override
    public boolean isSubjectIn(SubjectInterface subject) {
        return subjectToScore.containsKey(subject);
    }


    @Override
    public boolean insertScore(ScoreInterface score) {
        if (subjectToScore.containsKey(score.getSubject())) {
            return false;
        }
        subjectToScore.put(score.getSubject(), score);
        return true;
    }

    @Override
    public boolean deleteScore(ScoreInterface score) {
        if (subjectToScore.containsKey(score.getSubject())) {
            subjectToScore.remove(score.getSubject());
            return true;
        }
        return false;
    }

    @Override
    public ScoreInterface searchScoreBySubject(SubjectInterface subject) {
        return subjectToScore.get(subject);
    }

    @Override
    public Iterator<ScoreInterface> iterator() {
        return new Iterator<>() {
            private final Iterator<SubjectInterface> keyIterator = subjectToScore.keySet().iterator();

            @Override
            public boolean hasNext() {
                return keyIterator.hasNext();
            }

            @Override
            public ScoreInterface next() {
                return subjectToScore.get(keyIterator.next());
            }
        };
    }

    @Override
    public int compareTo(ScoreManagerInterface o) {
        return this.user.compareTo(o.getUser());
    }

    @Override
    public String toString() {
        StringBuilder scoreManager = new StringBuilder();
        scoreManager.append("姓名:").append(this.user.getUsername()).append("\n");
        for (ScoreInterface score : this) {
            scoreManager.append(score);
        }
        return scoreManager.toString();
    }
}
