import models.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EventRepository;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EventRepositoryTests {

    private EventRepository repository;
    private Event event;

    @BeforeEach
    public void setup(){
        this.repository = new EventRepository();
        this.event = new Event(EventTests.TEST_EVENT_ID, EventTests.TEST_EVENT_TITLE, EventTests.TEST_EVENT_START, EventTests.TEST_EVENT_END,
                EventTests.TEST_EVENT_DESCRIPTION);
    }

    @Test
    public void same_object_in_repo_test(){
        repository.add(event);
        assertSame(event, repository.getById(event.getEventID()));
    }
    @Test
    public void get_all_method_test(){

        repository.add(event);
        ArrayList<Event> testEventArray = new ArrayList<>();

        testEventArray.add(event);

        assertEquals(testEventArray, repository.getAll());
    }
    @Test
    public void add_event_method_test(){
        repository.add(event);
        Event testEvent = repository.getById(event.getEventID());

        assertNotNull(testEvent);
    }
    @Test
    public void remove_event_method_test(){
        repository.add(event);
        repository.delete(event);
        Event testEvent = repository.getById(event.getEventID());

        assertNull(testEvent);

    }
}
