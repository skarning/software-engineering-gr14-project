package models;
import enumerations.Enums;

public class User extends Person {
    private int     userId;
    private String  userName;
    private String  password;
    private Enums.UserLevels userLevel;

    public User(int userId, String userName, String password, int personId,
                String firstName, String lastName, int age, Enums.UserLevels userLevel) {
        super(personId, firstName, lastName, age);
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userLevel = userLevel;
    }

    public User(int testUserId, String testUserName, String testPassword, int testPersonId, String testFirstName, String testLastName, int testAge) {
        super(testPersonId, testFirstName, testLastName, testAge);
        this.userId = testUserId;
        this.userName = testUserName;
        this.password = testPassword;
    }

    public int getUserId() { return this.userId; }

    public String getUserName() { return this.userName; }

    public String getPassword() { return password; }

    public Enums.UserLevels getUserLevel() { return this.userLevel; }
}