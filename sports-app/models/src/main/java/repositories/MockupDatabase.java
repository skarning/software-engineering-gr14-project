package repositories;

import enumerations.Enums;
import models.Event;
import models.User;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MockupDatabase {

    public static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<Event> events = new ArrayList<Event>();


    public static void emptyDatabase() {
        users.removeAll(users);
        events.removeAll(events);
    }

    public static void getGeneratedEvents() {
        events.add(new Event(1, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
        events.add(new Event(2, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
        events.add(new Event(3, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
    }

    public static void getGeneratedUsers() {
        users.add(new User(21, "Vlad", "Pad", 1, "Vlad", "Pad", 21, Enums.UserLevels.club));
    }
}
