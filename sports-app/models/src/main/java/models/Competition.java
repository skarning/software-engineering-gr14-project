package models;

import java.util.ArrayList;
import java.util.Date;

public class Competition {
    private Result result;
    private int competitionId;
    private ArrayList<Participant> participants;
    private Date competitionStart;

    public Competition(int competitionId, Date competitionStart) {
        this.competitionId = competitionId;
        this.competitionStart = competitionStart;
    }
}
