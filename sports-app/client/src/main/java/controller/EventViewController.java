package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Event;
import repositories.EventRepository;
import tornadofx.control.DateTimePicker;

import java.time.LocalDateTime;

public class EventViewController {
    private EventRepository repository = new EventRepository();
    private ObservableList<Event> events = FXCollections.observableArrayList(repository.getAll());

    public EventViewController() {
        this.repository = new EventRepository();
    }

    @FXML
    Button createEventButton = new Button();

    @FXML
    TextArea eventDescription = new TextArea();

    @FXML
    TextField eventName = new TextField();

    @FXML
    DateTimePicker startDateTime = new DateTimePicker();

    @FXML
    DateTimePicker endDateTime = new DateTimePicker();

    @FXML
    TextField eventLocation = new TextField();

    @FXML
    public void createEvent() {
        String eventDescriptionText = eventDescription.getText();
        String eventTitleText = eventName.getText();
        LocalDateTime startDate = startDateTime.getDateTimeValue();
        LocalDateTime endDate = endDateTime.getDateTimeValue();
        String eventLocationText = eventLocation.getText();

        repository.add(new Event(eventLocationText, eventTitleText, startDate, endDate, eventDescriptionText));
        System.out.println(repository.getById(1));
    }
}
