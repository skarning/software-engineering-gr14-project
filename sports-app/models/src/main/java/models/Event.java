package models;

public class Event {

    private String eventTitle;
    private String eventDescription;
    private int eventID;
    private int eventStartDate; // in yymmdd format
    private int eventEndDate; // as above
    private int eventStartTime; // in hhmm format
    private int eventEndTime; // as above

    public Event (int eventID, String eventTitle, int eventStartDate, int eventEndDate, int eventStartTime, int eventEndTime){
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    // adding the description on making the event is optional
    public Event (int eventID, String eventTitle, int eventStartDate, int eventEndDate, int eventStartTime, int eventEndTime,
                  String eventDescription){
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.eventDescription = eventDescription;
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

    public int getEventStartDate() {
        return eventStartDate;
    }

    public int getEventEndDate() {
        return eventEndDate;
    }

    public int getEventStartTime() {
        return eventStartTime;
    }

    public int getEventEndTime() {
        return eventEndTime;
    }
}
