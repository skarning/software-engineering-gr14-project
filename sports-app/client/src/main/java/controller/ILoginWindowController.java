package controller;

import enumerations.Enums;

public interface ILoginWindowController {
    void admin_goes_to_admin_view_when_clicked();
    void club_goes_to_club_view_when_clicked();
    void create_new_user_depending_on_user_when_user_logs_in(Enums.UserLevels userRights);
}
