
import Map;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class HkNetSystem {

    /**
     * Default constructor
     */
    public HkNetSystem() {
    }

    /**
     * 
     */
    private Map activeSessions;

    /**
     * 
     */
    private AssetRepository assetRepo;

    /**
     * 
     */
    private UserRepository userRepo;



    /**
     * 
     */
    public HkNetSystem() {
        // TODO implement here
    }

    /**
     * @param username 
     * @param password 
     * @return
     */
    public UserSession login(String username, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param sessionId 
     * @return
     */
    public void logout(String sessionId) {
        // TODO implement here
        return null;
    }

    /**
     * @param sessionId 
     * @param criteria 
     * @return
     */
    public Set<ISearchableAsset> searchAssets(String sessionId, SearchCriteria criteria) {
        // TODO implement here
        return null;
    }

    /**
     * @param sessionId 
     * @param assets 
     * @return
     */
    public CredentialPackage createCredentialPackage(String sessionId, Set<ISearchableAsset> assets) {
        // TODO implement here
        return null;
    }

}