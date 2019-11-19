import models.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTests {

    private Event event;

    protected static final int TEST_EVENT_ID = 2;
    protected static final String TEST_EVENT_TITLE = "Mortens Internettløse Dager";
    protected static final String TEST_EVENT_DESCRIPTION = "Han har det jævlig uten internett";
    protected static final LocalDateTime TEST_EVENT_START = LocalDateTime.now();
    protected static final LocalDateTime TEST_EVENT_END = LocalDateTime.now();
    protected static final String TEST_LOCATION = "sarpsborg";


    @BeforeEach
    public void setup(){
        this.event = new Event(TEST_LOCATION, TEST_EVENT_TITLE, TEST_EVENT_START, TEST_EVENT_END, TEST_EVENT_DESCRIPTION);
    }

    @Test
    public void get_ID_test(){
        assertEquals(TEST_EVENT_ID, event.getEventID());
    }

    @Test
    public void iD_counter_test(){
        assertEquals(1, event.getEventID());
    }

    @Test
    public void get_title_test(){
        assertEquals(TEST_EVENT_TITLE, event.getEventTitle());
    }
    @Test
    public void get_description_test(){
        assertEquals(TEST_EVENT_DESCRIPTION, event.getEventDescription());
    }
    @Test
    public void get_start_date_test(){
        assertEquals(TEST_EVENT_START, event.getEventStartDate());
    }
    @Test
    public void get_end_date_test(){
        assertEquals(TEST_EVENT_END, event.getEventEndDate());
    }
    @Test
    public void set_description_on_event_with_description_test(){
        event.setEventDescription("Martin");
        assertEquals("Martin", event.getEventDescription());
    }
}