package gr.aueb.cf.ch11_ch12;

/**
 * student class definition
 * POJO class (Plain Old Java Object)
 * Javabean.
 */

//Private constructor
public class Student {
    private static int studentsCount = 0;
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

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

    public static int getStudentsCount() {
        return studentsCount;
    }

}
