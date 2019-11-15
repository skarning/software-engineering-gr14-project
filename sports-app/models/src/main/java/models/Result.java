package models;

public class Result {
    private Participant participant;
    private long time;
    private long timeDff;              // Time difference from first place

    public Result(Participant participant, Competition competition) {
        this.participant = participant;
        this.time = time;
    }

    public Participant getParticipant() {
        return participant;
    }
}
