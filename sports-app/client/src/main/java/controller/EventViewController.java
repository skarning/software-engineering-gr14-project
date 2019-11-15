package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import repositories.EventRepository;

public class EventViewController {
    EventRepository repository;

    public EventViewController() {
        this.repository = new EventRepository();
    }

    @FXML
    Button createEventButton = new Button();

    @FXML
    TextArea textArea = new TextArea();

    @FXML
    public void createEvent() {
        
    }
}