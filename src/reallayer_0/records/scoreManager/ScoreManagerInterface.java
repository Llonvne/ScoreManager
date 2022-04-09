package reallayer_0.records.scoreManager;

import reallayer_0.records.score.ScoreInterface;
import reallayer_0.records.subject.SubjectInterface;
import reallayer_0.user.types.UserInterface;

public interface ScoreManagerInterface extends Iterable<ScoreInterface>,Comparable<ScoreManagerInterface> {
    UserInterface getUser();
    boolean isSubjectIn(SubjectInterface subject);
    boolean insertScore(ScoreInterface score);
    boolean deleteScore(ScoreInterface score);
    ScoreInterface searchScoreBySubject(SubjectInterface subject);
}
