package models;

public class User extends Person {
    private int     userId;
    private String  userName;
    private String  password;

    public User(int userId, String userName, String password, int personId,
                String firstName, String lastName, int age) {
        super(personId, firstName, lastName, age);
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() { return this.userId; }

    public String getUserName() { return this.userName; }

    public String getPassword() { return password; }
}