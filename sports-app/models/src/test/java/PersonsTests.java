import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class PersonsTests {
    Person person;

    private final int    testId = 1;
    private final String testFirstName = "lisa";
    private final String testLastName = "prat";
    private final String testFullName = "lisa prat";
    private final int    testAge = 20;

    /* Runs before each test to
    configure a new object
     */
    @BeforeEach
    public void setup() {
        person = Mockito.mock(Person.class, Mockito.withSettings().useConstructor(this.testId, this.testFirstName,
                this.testLastName, this.testAge).defaultAnswer(Mockito.CALLS_REAL_METHODS));
    }

    @Test
    public void getFullName_firstName_lastName() {
        assertEquals(testFullName, this.person.getFullName());
    }
}
