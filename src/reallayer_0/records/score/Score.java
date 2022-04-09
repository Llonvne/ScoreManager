package reallayer_0.records.score;

import reallayer_0.records.scoreEntry.ScoreEntryInterface;
import reallayer_0.records.subject.SubjectInterface;

import java.util.*;

/**
 * 类名:     Score
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Score implements ScoreInterface{
    private final TreeMap<String, ScoreEntryInterface> scores;
    private final SubjectInterface subject;

    public Score(SubjectInterface subject) {
        this.subject = subject;
        this.scores = new TreeMap<>();
    }

    @Override
    public SubjectInterface getSubject() {
        return subject;
    }

    @Override
    public boolean addScore(ScoreEntryInterface scoreEntry) {
        if (scores.containsKey(scoreEntry.getScoreName())) {
            return false;
        }
        scores.put(scoreEntry.getScoreName(), scoreEntry);
        return true;
    }

    @Override
    public boolean deleteScore(String scoreName) {
        if (this.scores.containsKey(scoreName)) {
            this.scores.remove(scoreName);
            return true;
        }
        return false;
    }

    @Override
    public boolean isScoreIn(String scoreName) {
        return scores.containsKey(scoreName);
    }

    @Override
    public Iterator<ScoreEntryInterface> iterator() {
        return new Iterator<>() {
            private final Iterator<String> keyIterator = scores.keySet().iterator();

            @Override
            public boolean hasNext() {
                return keyIterator.hasNext();
            }

            @Override
            public ScoreEntryInterface next() {
                return scores.get(keyIterator.next());
            }
        };
    }

    @Override
    public int compareTo(ScoreInterface o) {
        return this.subject.compareTo(o.getSubject());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("科目：").append(getSubject()).append("\n");
        for (ScoreEntryInterface scoreEntry : this) {
            result.append(scoreEntry).append("\n");
        }
        return result.toString();
    }
}
