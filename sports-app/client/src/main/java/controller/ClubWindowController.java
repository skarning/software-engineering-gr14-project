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
    @FXML
    private Button createEventButton = new Button();
    @FXML
    private Button deleteEventButton = new Button();
    MainJavaFX mainJavaFX = new MainJavaFX();

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

    private ObservableList<Event> eventObservableList;

    public ClubWindowController() {
        repository = new EventRepository();
    }

    public void initialize(){
        eventObservableList = FXCollections.observableArrayList(repository.getAll());
        eventList.setItems(eventObservableList);
    }

    public void refreshClubWindow(){
        eventList.getItems().clear();
        initialize();
    }
}
