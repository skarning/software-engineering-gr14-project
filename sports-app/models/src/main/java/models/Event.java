package models;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Event {

    private String eventTitle;
    private String eventDescription;
    private int eventID;
    private String location;

    private LocalDateTime eventStart;
    private LocalDateTime eventEnd;
    private ArrayList<Competition> competitions;

    private static int idCounter = 0;

    public Event (String location, String eventTitle, LocalDateTime eventStart, LocalDateTime eventEnd, String eventDescription){
        idCounter++;
        this.eventID = idCounter;
        this.eventTitle = eventTitle;
        this.location = location;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;

        this.eventDescription = eventDescription;
        this.competitions = new ArrayList<>();
    }

    public static boolean id_is_unique() {
        
    }

    @Override
    public String toString(){
        return "ID: "+ eventID + ", Title: " + eventTitle;
    }

    public void addCompetition(Competition competition) {
        competitions.add(competition);
    }

    public void reset_IdCounter(){
        idCounter = 0;
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

}
