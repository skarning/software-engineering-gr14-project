package models;

public abstract class Person {
    private int     personId;
    private String  firstName;
    private String  lastName;
    private int     age;

    public Person(int personId, String firstName, String lastName, int age) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getPersonId() {
        return this.personId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public int getAge() {
        return age;
    }
}
