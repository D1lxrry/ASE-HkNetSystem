
import java.io.*;
import java.util.*;

/**
 * 
 */
public class HkEmployee extends User {

    /**
     * Default constructor
     */
    public HkEmployee() {
    }

    /**
     * 
     */
    private String employeeTitle;


    /**
     * 
     */
    private Set<CredentialPackage> createdPackages;

    /**
     * @param userId 
     * @param username 
     * @param title
     */
    public HkEmployee(String userId, String username, String title) {
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
     * @param pkg 
     * @return
     */
    public void addCreatedPackage(CredentialPackage pkg) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract String getUserType();

}