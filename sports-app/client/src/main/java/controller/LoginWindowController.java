package controller;

import enumerations.Enums;
import handlers.ProfileHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.MainJavaFX;
import models.User;
import repositories.UserRepository;

public class LoginWindowController implements ILoginWindowController {

    UserRepository userRepository;

    @FXML
    public AnchorPane loginWindow = new AnchorPane();
    @FXML
    private Button loginButtonClub = new Button();
    @FXML
    private Button loginButtonAdmin = new Button();

    private MainJavaFX mainJavaFx = new MainJavaFX();

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public LoginWindowController() {
        this.userRepository = new UserRepository();
    }

    public void initialize() {
    }

    @FXML
    @Override
    public void admin_goes_to_admin_view_when_clicked() {
        create_new_user_depending_on_user_when_user_logs_in(Enums.UserLevels.administrator);
        mainJavaFx.admin_window(new Stage());
    }

    @FXML
    @Override
    public void club_goes_to_club_view_when_clicked() {
        create_new_user_depending_on_user_when_user_logs_in(Enums.UserLevels.club);
        mainJavaFx.club_window(new Stage());
    }

    @Override
    public void create_new_user_depending_on_user_when_user_logs_in(Enums.UserLevels userRights) {
        User user = new User(1, "testUser", "pass", 1,
                "test", "testesen", 12, userRights);
        ProfileHandler.setUser(user);
        this.userRepository.add(user);
    }

}
