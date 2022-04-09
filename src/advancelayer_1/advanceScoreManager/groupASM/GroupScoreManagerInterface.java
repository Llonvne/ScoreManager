package advancelayer_1.advanceScoreManager.groupASM;

import advancelayer_1.advanceScoreManager.advanceScoreManager.AdvanceScoreManager;
import advancelayer_1.advanceScoreManager.advanceScoreManager.AdvanceScoreManagerInterface;
import advancelayer_1.user.AdvanceUser;

public interface GroupScoreManagerInterface {
    AdvanceScoreManagerInterface getUserScoreManager(AdvanceUser user);
}
