import models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class PersonsTests {
    Person person;

    protected static final int    testPersonId = 1;
    protected static final String testFirstName = "lisa";
    protected static final String testLastName = "prat";
    protected static final String testFullName = "lisa prat";
    protected static final int    testAge = 20;

    /* Runs before each test to
    configure a new object
     */
    @BeforeEach
    public void setup() {
        /* Person is an abstract class.
        A mock object of person is created
        to test its functionality
         */
        this.person = Mockito.mock(Person.class, Mockito.withSettings().useConstructor(this.testPersonId, this.testFirstName,
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
