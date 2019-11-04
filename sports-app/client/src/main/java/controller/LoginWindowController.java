package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.MainJavaFX;

public class LoginWindowController implements ILoginWindowController {

    @FXML
    private Button loginButtonClub, loginButtonAdmin;

    private MainJavaFX mainJavaFx = new MainJavaFX();

    public void initialize() {
        loginButtonClub = new Button("Club");
        loginButtonAdmin = new Button("Admin");
    }

    @FXML
    @Override
    public void goToClubWindowWhenClicked() {
        mainJavaFx = new MainJavaFX();
        mainJavaFx.clubWindow(new Stage());
    }

    @FXML
    @Override
    public void goToAdminWindowWhenClicked() {
        mainJavaFx = new MainJavaFX();
        mainJavaFx.adminWindow(new Stage());
    }
}
