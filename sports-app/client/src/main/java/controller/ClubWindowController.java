package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import main.MainJavaFX;
import models.Event;

import repositories.EventRepository;


public class ClubWindowController {

    private EventRepository repository;
    private MainJavaFX mainJavaFX = new MainJavaFX();
    @FXML
    private Button createEventButton = new Button();
    @FXML
    private Button deleteEventButton = new Button();
    @FXML
    public Button generateEventsWindowButton = new Button();

    @FXML
    private ListView<Event> eventList;

    @FXML
    private Button refreshClubWindowButton;

    @FXML
    public void OpenCreateNewEventWindow() {
        mainJavaFX.event_window(new Stage());
    }

    @FXML
    public void OpenDeleteEventWindow() {
        mainJavaFX.delete_event_window(new Stage());
    }

    public ClubWindowController() {
            repository = new EventRepository();
        }

        @FXML
        public void initialize() {
            ObservableList<Event> eventObservableList = FXCollections.observableArrayList(repository.getAll());
            eventList.setItems(eventObservableList);
        }

        public void refreshClubWindow () {
            eventList.getItems().clear();
            initialize();
        }
}