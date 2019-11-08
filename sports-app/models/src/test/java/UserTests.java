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
        this.user = new User(this.testUserId, this.testUserName, this.testPassword, PersonsTests.testPersonId,
                PersonsTests.testFirstName, PersonsTests.testLastName, PersonsTests.testAge);
    }

    @Test
    public void getUserId_userId(){
        assertEquals(this.testUserId, user.getUserId());
    }

    @Test
    public void getUserName_userName() {
        assertEquals(this.testUserName, user.getUserName());
    }

    @Test
    public void getPassword_password() {
        assertEquals(this.testPassword, user.getPassword());
    }
 }
