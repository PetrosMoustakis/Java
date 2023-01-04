package model;

/**
 * defines a {@link User} class
 *
 * @since 0.1
 * @version 1.0
 * @author petros
 */
public class User {

    /**
     * Defines a user type
     */
    private int id;
    private String username;
    private String password;


    /**
     * creates a default user with zero id and null username and password
     */
    public User() {}

    /**
     * gets user's id
     * @return user's id
     */
    public int getId() {
        return id;
    }

    /**
     * sets user's id
     * @param id user's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * gets user's username
     * @return user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * sets user's username
     * @param username user's username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * gets user's password
     * @return user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets user's password
     * @param password user's password
     */

    public void setPassword(String password) {
        this.password = password;
    }
}
