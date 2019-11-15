package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Event;

public class DeleteEventWindowController {

    private static ObservableList<Event> event = FXCollections.observableArrayList();

    @FXML
    private Button deleteEvent = new Button();
    @FXML
    private ListView eventListView = new ListView<>(event);


}
