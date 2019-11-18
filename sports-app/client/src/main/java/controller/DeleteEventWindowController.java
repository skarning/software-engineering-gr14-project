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


public class DeleteEventWindowController {
    @FXML
    private Button deleteEvent = new Button();
    @FXML
    private ListView<Event> eventListView = new ListView<Event>();

    @FXML
    public void initialize() {

        // denne kommer til å lage nye objekter hver gang vinduet åpnes
        // med andre ord, de slettes ikke permanent
        if (MockupDatabase.events.isEmpty()){
            MockupDatabase.addEvents();
        }

        ObservableList<Event> events = FXCollections.observableArrayList(MockupDatabase.events);

        eventListView.setItems(events);

        eventListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Event>() {
            @Override
            public void changed(ObservableValue<? extends Event> observableValue, Event forrigeEvent, Event nyeEvent) {
                deleteEvent.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        events.remove(nyeEvent);
                    }
                });
            }
        });

        eventListView.getSelectionModel().select(0);
    }

}
