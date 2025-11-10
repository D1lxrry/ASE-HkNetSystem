// User.java (Abstract Class)
// The base class for all users. Cannot be instantiated directly.
public abstract class User {

    protected String userId;
    protected String username;
    protected String email;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getUserId() { return userId; }
    public String getUsername() { return username; }

    // Abstract method: must be implemented by subclasses
    public abstract String getUserType();
}