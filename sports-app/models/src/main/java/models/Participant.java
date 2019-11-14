package models;

public class Participant {
    private Athlete athlete;
    private int participantId;

    public Participant(int participantId, Athlete athlete) {
        this.participantId = participantId;
        this.athlete = athlete;
    }
}
