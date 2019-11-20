package requirementsTests;

import controller.EventViewController;
import javafx.application.Application;
import main.MainJavaFX;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EventRepository;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class CreateEventsTest {
    private EventRepository repository;
    private EventViewController controller;

    private final String LOCATION = "sarpsborg";
    private final String DESCRIPTION = "test";
    private final String TITLE = "myTtile";
    private final LocalDateTime STARTDATE = LocalDateTime.now();
    private final LocalDateTime ENDDATE = LocalDateTime.now();


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

        controller = new EventViewController();
        repository = new EventRepository();
        repository.removeAll();
    }

    /*
        Testing requirement 2.2
        A club shall be able to create Events
    */
    @Test
    public void createEvent_event_gets_created() {
        assertEquals(0, repository.getAll().size());
        controller.addEvent(LOCATION, TITLE, STARTDATE, ENDDATE, DESCRIPTION);
        assertEquals(1, repository.getAll().size());
    }
}
