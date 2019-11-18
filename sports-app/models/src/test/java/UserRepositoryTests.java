import models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.MockupDatabase;
import repositories.UserRepository;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTests {
    private UserRepository repository;
    private User user;

    @BeforeEach
    public void setup() {
        this.repository = new UserRepository();
        this.user = new User(UserTests.testUserId, UserTests.testUserName, UserTests.testPassword, PersonsTests.TEST_PERSON_ID,
                PersonsTests.TEST_FIRST_NAME, PersonsTests.TEST_LAST_NAME, PersonsTests.TEST_AGE);
        MockupDatabase.emptyDatabase();
    }

    @Test
    public void getUserById_user() {
        this.repository.add(user);
        assertSame(user, this.repository.getById(user.getUserId()));
    }

    @Test
    public void getAll_list_of_users(){
        this.repository.add(this.user);

        ArrayList<User> testUserList = new ArrayList<>();
        testUserList.add(this.user);

        assertEquals(testUserList, this.repository.getAll());
    }

    /*
        Tests that the deleteUser deletes user
        by testing if getById returns null
        after a repository.deleteUser
     */
    @Test
    public void deleteUser_delete_a_specific_user() {
        User testUser = this.repository.getById(UserTests.testUserId);
        repository.delete(user);
        testUser = this.repository.getById(UserTests.testUserId);
        assertNull(testUser);
    }

    /*
        Tests that the addUser adds a user
        by testing if getById is not null
        after a repository.addUser
     */
    @Test
    public void add_add_user(){
        User user = this.repository.getById(UserTests.testUserId);
        this.repository.add(this.user);
        user = this.repository.getById(UserTests.testUserId);
        assertNotNull(user);
    }
}