package models;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Athlete> athletes;

    public Team(String teamName) {
        this.athletes = new ArrayList<Athlete>();
    }

    public void addAthlete(Athlete athlete) {
        this.athletes.add(athlete);
    }
}
