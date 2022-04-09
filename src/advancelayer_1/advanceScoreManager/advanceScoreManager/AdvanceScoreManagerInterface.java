package advancelayer_1.advanceScoreManager.advanceScoreManager;

import advancelayer_1.result.Result;
import reallayer_0.records.score.ScoreInterface;
import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.records.subject.SubjectInterface;

public interface AdvanceScoreManagerInterface extends ScoreManagerInterface {
    Result<ScoreInterface> safeSearchScoreBySubject(SubjectInterface subject);
}
