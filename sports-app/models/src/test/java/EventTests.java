import models.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTests {

    private Event event;

    protected static final int testEventID = 01;
    protected static final String testEventTitle = "Mortens Internettløse Dager";
    protected static final String testEventDescription = "Han har det jævlig uten internett";
    protected static final int testEventStartDate = 191110;
    protected static final int testEventEndDate = 191214;
    protected static final int testEventStartTime = 0000;
    protected static final int testEventEndTime = 2359;


    @BeforeEach
    public void setup(){
        this.event = new Event(testEventID, testEventTitle, testEventStartDate, testEventEndDate, testEventStartTime,
                testEventEndTime, testEventDescription);
    }

    @Test
    public void get_ID_test(){
        assertEquals(testEventID, event.getEventID());
    }
    @Test
    public void get_title_test(){
        assertEquals(testEventTitle, event.getEventTitle());
    }
    @Test
    public void get_description_test(){
        assertEquals(testEventDescription, event.getEventDescription());
    }
    @Test
    public void get_start_time_test(){
        assertEquals(testEventStartTime, event.getEventStartTime());
    }
    @Test
    public void get_end_time_test(){
        assertEquals(testEventEndTime, event.getEventEndTime());
    }
    @Test
    public void get_start_date_test(){
        assertEquals(testEventStartDate, event.getEventStartDate());
    }
    @Test
    public void get_end_date_test(){
        assertEquals(testEventEndDate, event.getEventEndDate());
    }
}
