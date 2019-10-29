import models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class PersonsTests {
    Person person;

    private final int    testPersonId = 1;
    private final String testFirstName = "lisa";
    private final String testLastName = "prat";
    private final String testFullName = "lisa prat";
    private final int    testAge = 20;

    /* Runs before each test to
    configure a new object
     */
    @BeforeEach
    public void setup() {
        /* Person is an abstract class.
        A mock object of person is created
        to test its functionality
         */
        person = Mockito.mock(Person.class, Mockito.withSettings().useConstructor(this.testPersonId, this.testFirstName,
                this.testLastName, this.testAge).defaultAnswer(Mockito.CALLS_REAL_METHODS));
    }

    @Test
    public void getFullName_firstName_lastName() {
        assertEquals(testFullName, this.person.getFullName());
    }

    @Test
    void getFirstName_firstName() {
        assertEquals(testFirstName, this.person.getFirstName());
    }

    @Test
    void getLastName_lastName() {
        assertEquals(testLastName, this.person.getLastName());
    }

    @Test
    void getAge_age() {
        assertEquals(testAge, this.person.getAge());
    }

    @Test
    void getPersonId_personId() {
        assertEquals(testPersonId, this.person.getPersonId());
    }
}
