import models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class PersonsTests {
    Person person;

    protected static final int    TEST_PERSON_ID = 1;
    protected static final String TEST_FIRST_NAME = "lisa";
    protected static final String TEST_LAST_NAME = "prat";
    protected static final String TEST_FULL_NAME = "lisa prat";
    protected static final int    TEST_AGE = 20;

    /* Runs before each test to
    configure a new object
     */
    @BeforeEach
    public void setup() {
        /* Person is an abstract class.
        A mock object of person is created
        to test its functionality
         */
        this.person = Mockito.mock(Person.class, Mockito.withSettings().useConstructor(this.TEST_PERSON_ID, this.TEST_FIRST_NAME,
                this.TEST_LAST_NAME, this.TEST_AGE).defaultAnswer(Mockito.CALLS_REAL_METHODS));
    }

    @Test
    public void getFullName_firstName_lastName() {
        assertEquals(TEST_FULL_NAME, this.person.getFullName());
    }

    @Test
    void getFirstName_firstName() {
        assertEquals(TEST_FIRST_NAME, this.person.getFirstName());
    }

    @Test
    void getLastName_lastName() {
        assertEquals(TEST_LAST_NAME, this.person.getLastName());
    }

    @Test
    void getAge_age() {
        assertEquals(TEST_AGE, this.person.getAge());
    }

    @Test
    void getPersonId_personId() {
        assertEquals(TEST_PERSON_ID, this.person.getPersonId());
    }
}
