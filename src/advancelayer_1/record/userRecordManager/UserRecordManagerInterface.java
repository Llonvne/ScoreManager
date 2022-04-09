package advancelayer_1.record.userRecordManager;

import advancelayer_1.result.Result;
import reallayer_0.records.score.ScoreInterface;
import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.records.subject.SubjectInterface;

public interface UserRecordManagerInterface extends ScoreManagerInterface {
    Result<ScoreInterface> safeSearchScoreBySubject(SubjectInterface subject);
}
