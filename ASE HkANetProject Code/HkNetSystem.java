// HkNetSystem.java (Updated Façade)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HkNetSystem {

    // COMPOSITION relationship: (1..*)
    // The system "owns" its sessions.
    // We use a Map to manage the 1..* relationship.
    private Map<String, UserSession> activeSessions;

    // COMPOSITION relationship: (1)
    // The system "owns" its repositories.
    private final AssetRepository assetRepo;
    private final UserRepository userRepo;

    public HkNetSystem() {
        this.assetRepo = new AssetRepository();
        this.userRepo = new UserRepository();
        this.activeSessions = new HashMap<>();
    }

    // --- Public Methods (from the Use Case) ---

    // 1. Implements 'Log In' use case (Updated)
    public UserSession login(String username, String password) {
        User user = userRepo.findUser(username, password);
        if (user != null) {
            UserSession session = new UserSession(user);
            // Add to the 1..* collection
            this.activeSessions.put(session.getSessionId(), session);
            return session;
        }
        return null;
    }
    
    public void logout(String sessionId) {
        this.activeSessions.remove(sessionId);
    }

    // 2. Implements 'Find...' (Updated)
    // This method now has a DEPENDENCY on SearchCriteria
    public List<ISearchableAsset> searchAssets(String sessionId, SearchCriteria criteria) {
        UserSession session = activeSessions.get(sessionId);
        if (session == null) {
            System.out.println("Error: Invalid session.");
            return new ArrayList<>(); // Return empty list
        }
        
        // ... (use criteria.getKeywords(), etc. to pass to assetRepo)
        // This is polymorphic, just as before
        return assetRepo.findAssets(criteria);
    }

    // 3. Implements 'Assemble Credential Package' (Updated)
    public CredentialPackage createCredentialPackage(String sessionId, List<ISearchableAsset> assets) {
        UserSession session = activeSessions.get(sessionId);
        if (session == null) return null; // Not logged in

        // Check if user is an employee (not a client)
        if (!(session.getAuthenticatedUser() instanceof HkEmployee)) {
            System.out.println("Error: Only employees can create packages.");
            return null;
        }
        
        // Enforce 1..* multiplicity
        if (assets == null || assets.isEmpty()) {
            System.out.println("Error: Package must contain at least one asset.");
            return null;
        }
        
        HkEmployee creator = (HkEmployee) session.getAuthenticatedUser();
        ISearchableAsset firstAsset = assets.get(0);
        
        CredentialPackage newPackage = new CredentialPackage(creator, firstAsset);
        
        // Add the rest
        for (int i = 1; i < assets.size(); i++) {
            newPackage.addAsset(assets.get(i));
        }
        
        return newPackage;
    }
}