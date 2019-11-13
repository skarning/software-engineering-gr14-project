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

    @FXML
    @Override
    public void adminUserGoesToAdminStageWhenClicked() {
        mainJavaFx.adminWindow(new Stage());
    }

    @FXML
    @Override
    public void clubUserGoesToClubStageWhenClicked() {
        mainJavaFx.clubWindow(new Stage());
    }
}
