package models;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Event {

    private String eventTitle;
    private String eventDescription;
    private int eventID;
    private LocalDateTime eventStart;
    private LocalDateTime eventEnd;
    private ArrayList<Competition> competitions;

    public Event (int eventID, String eventTitle, LocalDateTime eventStart, LocalDateTime eventEnd, String eventDescription){
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.eventDescription = eventDescription;
        this.competitions = new ArrayList<Competition>();
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public int getEventID() {
        return eventID;
    }

    public LocalDateTime getEventStartDate() {
        return eventStart;
    }

    public LocalDateTime getEventEndDate() {
        return eventEnd;
    }

    public void AddCompetition(Competition competition) {
        competitions.add(competition);
    }
}
