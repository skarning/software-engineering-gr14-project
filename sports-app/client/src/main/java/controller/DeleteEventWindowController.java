package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Event;
import repositories.EventRepository;

public class DeleteEventWindowController {
    @FXML
    private Button deleteEvent = new Button();
    @FXML
    private ListView<Event> eventListView = new ListView<Event>();
    @FXML
    private Button deleteAllEvents = new Button();
    private EventRepository eventRepository;
    private ObservableList<Event> events;

    @FXML
    public void initialize() {
        eventRepository = new EventRepository();
        events = FXCollections.observableArrayList(eventRepository.getAll());
        eventListView.setItems(events);
    }

    @FXML
    public void deleteAllEvents() {
        eventRepository.removeAll();
        initialize();
    }

    @FXML
    public void deleteSelectedEvents() {
        eventRepository.delete(eventListView.getSelectionModel().getSelectedItem());
        initialize();
    }
}
