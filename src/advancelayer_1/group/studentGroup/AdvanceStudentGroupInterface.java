package advancelayer_1.group.studentGroup;

import advancelayer_1.result.Result;
import reallayer_0.group.studentGroup.StudentGroupInterface;
import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.user.types.StudentInterface;

public interface AdvanceStudentGroupInterface extends StudentGroupInterface {
    Result<ScoreManagerInterface> safeGetStudentScoreManager(StudentInterface student);
}
