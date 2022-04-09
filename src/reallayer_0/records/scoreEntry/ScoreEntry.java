package reallayer_0.records.scoreEntry;

import java.util.Vector;

/**
 * 类名:     ScoreEntry
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class ScoreEntry implements ScoreEntryInterface, Comparable<ScoreEntry> {
    private final String scoreName;
    private final Vector<Double> scores;
    private static final String defaultScoreName = "默认成绩";

    public ScoreEntry(String scoreName, Vector<Double> scores) {
        this.scoreName = scoreName;
        this.scores = scores;
    }

    public ScoreEntry(Vector<Double> scores) {
        this.scoreName = defaultScoreName;
        this.scores = scores;
    }

    @Override
    public String getScoreName() {
        return scoreName;
    }

    @Override
    public Vector<Double> getScores() {
        return scores;
    }

    @Override
    public int compareTo(ScoreEntry o) {
        return this.scoreName.compareTo(o.scoreName);
    }

    @Override
    public String toString() {
        return getScoreName() + getScores();
    }
}
