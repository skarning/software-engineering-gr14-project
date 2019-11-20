package requirementsTests;

import controller.DeleteEventWindowController;
import javafx.application.Application;
import main.MainJavaFX;
import models.Event;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EventRepository;
import repositories.IRepository;
import repositories.MockupDatabase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DeleteEventsTests {
    private EventRepository repository;
    private DeleteEventWindowController controller;

    @BeforeAll
    public static void setup() throws InterruptedException {
        System.out.println("About to launch the application");
        Thread thread = new Thread("JavaFX Init Thread") {
            public void run() {
                Application.launch(MainJavaFX.class);
            }
        };
        thread.setDaemon(true);
        thread.start();
        System.out.println("Success: Application has been launched");
        Thread.sleep(500);
    }

    @BeforeEach
    public void init() {
        controller = new DeleteEventWindowController();
        repository = new EventRepository();
        repository.removeAll();
        repository.add(new Event("sarp", "title", LocalDateTime.now(), LocalDateTime.now(), "test"));
        repository.add(new Event("sarp", "testtitle", LocalDateTime.now(), LocalDateTime.now(), "test"));
        controller.initialize();
    }

    /* Testing part of requirement 2.3
        A club shall be able to delete events
    */

    @Test
    public void deleteSelectedEvents_events_deleted() {
        ArrayList<Event> testList = new ArrayList<>();
        for(Event event : repository.getAll()) {
            testList.add(event);
        }

        Event testEvent = testList.get(1);
        controller.deleteEvent(testEvent);

        for (Event event : repository.getAll()) {
            assertNotEquals(testEvent, event);
        }
    }

    @Test
    public void deleteAllEvents_events_deleted() {
        int length = repository.getAll().size();
        assertNotEquals(0, length);
        controller.deleteAllEvents();
        assertEquals(0, repository.getAll().size());
    }
}
