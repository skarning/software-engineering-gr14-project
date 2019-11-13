import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {
    private User user;

    // User test variables
    protected static final int    testUserId = 1;
    protected static final String testUserName = "foo";
    protected static final String testPassword = "pass";

    @BeforeEach
    public void Setup() {
        this.user = new User(testUserId, testUserName, testPassword, PersonsTests.TEST_PERSON_ID,
                PersonsTests.TEST_FIRST_NAME, PersonsTests.TEST_LAST_NAME, PersonsTests.TEST_AGE);
    }

    @Test
    public void getUserId_userId(){
        assertEquals(testUserId, user.getUserId());
    }

    @Test
    public void getUserName_userName() {
        assertEquals(testUserName, user.getUserName());
    }

    @Test
    public void getPassword_password() {
        assertEquals(testPassword, user.getPassword());
    }
 }
