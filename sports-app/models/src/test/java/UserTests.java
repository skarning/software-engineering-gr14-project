import Enumerations.Enums;
import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {
    private User user;

    // User test variables
    protected static final int    TEST_USER_ID = 1;
    protected static final String TEST_USER_NAME = "foo";
    protected static final String TEST_PASSWORD = "pass";
    protected static final Enum TEST_USER_LEVEL = Enums.UserLevels.club;

    @BeforeEach
    public void Setup() {
        this.user = new User(this.TEST_USER_ID, this.TEST_USER_NAME, this.TEST_PASSWORD, PersonsTests.TEST_PERSON_ID,
                PersonsTests.TEST_FIRST_NAME, PersonsTests.TEST_LAST_NAME, PersonsTests.TEST_AGE, Enums.UserLevels.club);
    }

    @Test
    public void getUserId_userId(){
        assertEquals(this.TEST_USER_ID, user.getUserId());
    }

    @Test
    public void getUserName_userName() {
        assertEquals(this.TEST_USER_NAME, user.getUserName());
    }

    @Test
    public void getPassword_password() {
        assertEquals(this.TEST_PASSWORD, user.getPassword());
    }

    @Test
    public void getUserLevel_userLevel() { assertEquals(this.TEST_USER_LEVEL, user.getUserLevel());}
 }
