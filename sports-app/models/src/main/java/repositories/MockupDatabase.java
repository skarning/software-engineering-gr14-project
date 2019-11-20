package repositories;

import enumerations.Enums;
import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class MockupDatabase {

    public static ArrayList<User> users = new ArrayList<User>();
    public static ArrayList<Event> events = new ArrayList<Event>();
    public static ArrayList<Competition> competitions = new ArrayList<Competition>();
    public static ArrayList<Result> results = new ArrayList<Result>();
    public static ArrayList<Participant> participants = new ArrayList<Participant>();


    public static void emptyDatabase() {
        users.removeAll(users);
        events.removeAll(events);
    }

    public static void getGeneratedEvents() {
        events.add(new Event(1, "Lillehammer", "OL", LocalDateTime.now(), LocalDateTime.now(), "Snø der"));
        events.add(new Event(2, "Lillehammer", "Mimre", LocalDateTime.now(), LocalDateTime.now(), "Kaldt"));
        events.add(new Event(3, "Lillehammer", "Reunion", LocalDateTime.now(), LocalDateTime.now(), "Skirenn"));
    }

    public static void getGeneratedUsers() {
        users.add(new User(21, "Vlad", "Pad", 1, "Vlad", "Pad", 21, Enums.UserLevels.club));
    }



    public static void getGeneratedCompetitions() {
        competitions.add(new Competition(1, LocalDateTime.now()));


    }

    private static void generateParticipant() {

    }

    private static void generateResults() {

    }
}
