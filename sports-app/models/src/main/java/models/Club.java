package models;

import java.util.ArrayList;

public class Club {
    private String clubName;
    private String location;
    private ArrayList<Team> teams;

    public Club(String clubName, String location) {
        this.clubName = clubName;
        this.location = location;
        this.teams = new ArrayList<Team>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
}
