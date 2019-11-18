package repositories;

import models.Event;
import models.User;

import java.util.ArrayList;

public class MockupDatabase {
    public static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<Event> events = new ArrayList<Event>();

    public static void emptyDatabase() {
        users.removeAll(users);
        events.removeAll(events);
    }
}
