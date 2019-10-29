import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {
    private User user;

    // User test variables
    private final int    testUserId = 1;
    private final String testUserName = "foo";
    private final String testPassword = "pass";

    // Person test Variables
    private final int    testPersonId = 1;
    private final String testFirstName = "lisa";
    private final String testLastName = "prat";
    private final String testFullName = "lisa prat";
    private final int    testAge = 20;

    @BeforeEach
    public void Setup() {
        this.user = new User(this.testUserId, this.testUserName, this.testPassword, this.testPersonId,
                this.testFirstName, this.testLastName, this.testAge);
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
