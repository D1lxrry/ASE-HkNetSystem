
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    protected String userId;

    /**
     * 
     */
    protected String username;

    /**
     * 
     */
    protected String email;


    /**
     * @param userId 
     * @param username
     */
    public User(String userId, String username) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getUserId() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public abstract String getUserType();

}