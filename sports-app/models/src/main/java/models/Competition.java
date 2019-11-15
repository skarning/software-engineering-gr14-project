package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Competition {
    private ArrayList<Result> results;
    private int competitionId;
    private ArrayList<Participant> participants;
    private LocalDateTime competitionStart;

    public Competition(int competitionId, LocalDateTime competitionStart) {
        this.competitionId = competitionId;
        this.competitionStart = competitionStart;
        this.results = new ArrayList<Result>();
    }

    public void addResult(Result result) {
        for(Result localRes : results) {
            if (result.getParticipant().equals(localRes.getParticipant()))
                return;
        }
        results.add(result);
    }
}
