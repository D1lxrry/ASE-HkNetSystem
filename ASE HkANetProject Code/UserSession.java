// UserSession.java
// This class will be COMPOSED by HkNetSystem
import java.util.Date;

public class UserSession {

    private String sessionId;
    
    // Association: 1-to-1 (Session has exactly 1 User)
    private User authenticatedUser;
    private Date loginTime;

    public UserSession(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        this.sessionId = java.util.UUID.randomUUID().toString();
        this.authenticatedUser = user;
        this.loginTime = new Date();
    }

    public User getAuthenticatedUser() {
        return this.authenticatedUser;
    }
}