package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.MainJavaFX;

public class ClubWindowController {
    @FXML
    private Button createEventButton = new Button();
    @FXML
    private Button deleteEventButton = new Button();
    MainJavaFX mainJavaFX = new MainJavaFX();

    @FXML
    public void OpenCreateNewEventWindow() {
        mainJavaFX.eventWindow(new Stage());
    }
    @FXML
    public void OpenDeleteEventWindow() {
        mainJavaFX.deleteEventWindow(new Stage());
    }
}
