package reallayer_0.records.score;

import reallayer_0.records.scoreEntry.ScoreEntryInterface;
import reallayer_0.records.subject.SubjectInterface;

public interface ScoreInterface extends Comparable<ScoreInterface>,Iterable<ScoreEntryInterface>{

    SubjectInterface getSubject();

    boolean addScore(ScoreEntryInterface scoreEntry);

    boolean deleteScore(String scoreName);

    boolean isScoreIn(String scoreName);
}
