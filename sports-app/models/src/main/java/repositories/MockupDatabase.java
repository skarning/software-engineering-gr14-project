package repositories;

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

    public static void addEvents() {

        events.add(new Event(01, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
        events.add(new Event(02, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
        events.add(new Event(03, "et sted", "en tittel", LocalDateTime.now(), LocalDateTime.now(), "en desk" ));
    }
}
