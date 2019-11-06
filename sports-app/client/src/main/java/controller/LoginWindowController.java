package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.MainJavaFX;

public class LoginWindowController implements ILoginWindowController {

    public Button getLoginButtonClub() {
        return loginButtonClub;
    }

    public Button getLoginButtonAdmin() {
        return loginButtonAdmin;
    }

    @FXML
    private Button loginButtonClub, loginButtonAdmin;

    private MainJavaFX mainJavaFx = new MainJavaFX();

    public void initialize() {
        loginButtonClub.setText(setTextOnLoginButtonClub());
        loginButtonAdmin.setText(setTextOnLoginButtonAdmin());
    }

    public String setTextOnLoginButtonClub() {
        return "Club";
    }

    public String setTextOnLoginButtonAdmin() {
        return "Admin";
    }

    @FXML
    @Override
    public void goToClubWindowWhenClicked() {
        mainJavaFx.clubWindow(new Stage());
    }

    @FXML
    @Override
    public void goToAdminWindowWhenClicked() {
        mainJavaFx.adminWindow(new Stage());
    }
}
