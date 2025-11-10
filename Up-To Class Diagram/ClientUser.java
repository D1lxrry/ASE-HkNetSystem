
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ClientUser extends User {

    /**
     * Default constructor
     */
    public ClientUser() {
    }


    /**
     * @param userId 
     * @param username 
     * @param company
     */
    public ClientUser(String userId, String username, ClientCompany company) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getUserType() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public ClientCompany getCompany() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract String getUserType();

}