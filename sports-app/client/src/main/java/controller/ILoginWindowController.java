package controller;

import enumerations.Enums;

public interface ILoginWindowController {
    void adminUserGoesToAdminStageWhenClicked();
    void clubUserGoesToClubStageWhenClicked();
    void createNewLoginTestUser(Enums.UserLevels userRights);
}
