package model;

/**
 * Defines a {@link Student} class
 *
 * @since 0.1
 * @version 1.0
 * @author petros
 */

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
