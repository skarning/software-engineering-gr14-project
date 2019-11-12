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

    public LoginWindowController() {
        this.userRepository = new UserRepository();
    }

    @FXML
    public AnchorPane loginWindow = new AnchorPane();
    @FXML
    private Button loginButtonClub = new Button();
    @FXML
    private Button loginButtonAdmin = new Button();

    private MainJavaFX mainJavaFx = new MainJavaFX();

    public void initialize() {
    }

    public Button getLoginButtonClub() {
        return loginButtonClub;
    }

    public Button getLoginButtonAdmin() {
        return loginButtonAdmin;
    }

    public AnchorPane getLoginWindow() {
        return loginWindow;
    }

    @FXML
    @Override
    public void goToClubWindowWhenClicked() {
        createNewLoginTestUser(Enums.UserLevels.club);
        mainJavaFx.clubWindow(new Stage());
    }

    @FXML
    @Override
    public void goToAdminWindowWhenClicked() {
        createNewLoginTestUser(Enums.UserLevels.administrator);
        mainJavaFx.adminWindow(new Stage());
    }

    public void createNewLoginTestUser(Enums.UserLevels userRights) {
        User user = new User(1, "testUser", "pass", 1,
                "test", "testesen", 12, userRights);
        ProfileHandler.setUser(user);
        this.userRepository.add(user);
    }
}
