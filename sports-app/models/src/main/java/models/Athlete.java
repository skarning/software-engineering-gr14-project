package models;

public class Athlete extends Person {
    private Team team;

    public Athlete(int personId, String firstName, String lastName, int age, Team team) {
        super(personId, firstName, lastName, age);
        this.team = team;
    }
}
