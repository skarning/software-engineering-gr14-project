package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.MainJavaFX;

public class LoginWindowController implements ILoginWindowController {

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
        mainJavaFx.clubWindow(new Stage());
    }

    @FXML
    @Override
    public void goToAdminWindowWhenClicked() {
        mainJavaFx.adminWindow(new Stage());
    }
}
