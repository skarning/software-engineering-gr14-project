import models.Event;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdRepositoryTests {

    private IdRepositoryTests repository;
    private Event event;

    @Test
    public void is_id_unique_test(){
        assertTrue(Event.id_is_unique());
    }
}
