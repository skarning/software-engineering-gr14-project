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
}
