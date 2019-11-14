package models;

import java.util.Date;

public class Event {

    private String eventTitle;
    private String eventDescription;
    private int eventID;
    private Date eventStart;
    private Date eventEnd;

    public Event (int eventID, String eventTitle, Date eventStart, Date eventEnd, int eventStartTime, int eventEndTime){
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
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

    public Date getEventStartDate() {
        return eventStart;
    }

    public Date getEventEndDate() {
        return eventEnd;
    }
}
