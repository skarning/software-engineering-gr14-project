package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Event;
import repositories.MockupDatabase;

import java.util.ArrayList;
import java.util.List;


public class DeleteEventWindowController {
    @FXML
    private Button deleteEvent = new Button();
    @FXML
    private ListView<Event> eventListView = new ListView<Event>();
    @FXML
    private Button deleteAllEvents = new Button();

    private ObservableList<Event> events = FXCollections.observableArrayList(MockupDatabase.events);

    @FXML
    public void initialize() {

        // denne kommer til å lage nye objekter hver gang vinduet åpnes
        // med andre ord, de slettes ikke permanent
        if (MockupDatabase.events.isEmpty()){
            MockupDatabase.addEvents();
        }

        eventListView.setItems(events);

        eventListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Event>() {
            @Override
            public void changed(ObservableValue<? extends Event> observableValue, Event forrigeEvent, Event nyeEvent) {
                deleteEvent.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        events.remove(nyeEvent);
                        //When exiting delete event window, ListView updates correctly when clicking refresh button
                        MockupDatabase.events.remove(nyeEvent);
                    }
                });
            }
        });

        eventListView.getSelectionModel().select(0);
    }

    @FXML
    public void deleteAllEvents(ActionEvent actionEvent) {
        eventListView.getItems().clear();
        MockupDatabase.events.clear();
    }
}
