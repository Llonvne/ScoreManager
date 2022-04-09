package reallayer_0.group.studentGroup;

import reallayer_0.records.scoreManager.ScoreManagerInterface;
import reallayer_0.user.types.StudentInterface;

public interface StudentGroupInterface {
    ScoreManagerInterface getStudentScoreManager(StudentInterface student);
}
