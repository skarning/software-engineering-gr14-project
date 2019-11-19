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
import repositories.EventRepository;
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

    private EventRepository eventRepository = new EventRepository();
    private ObservableList<Event> events = FXCollections.observableArrayList(eventRepository.getAll());


    @FXML
    public void initialize() {

        if (events.isEmpty()){
            eventRepository.generateData();
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
                        EventRepository eventRepository = new EventRepository();
                        eventRepository.delete(nyeEvent);
                    }
                });
            }
        });

        eventListView.getSelectionModel().select(0);
    }

    @FXML
    public void deleteAllEvents(ActionEvent actionEvent) {
        eventListView.getItems().clear();

        EventRepository eventRepository = new EventRepository();
        eventRepository.removeAll();
    }
}
