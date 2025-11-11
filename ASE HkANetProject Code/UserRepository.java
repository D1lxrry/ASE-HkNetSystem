

// UserRepository.java
// Handles user authentication

public class UserRepository {
    
    public User findUser(String username, String password) {
        // ... logic to validate credentials against a database
        if (username.equals("employee") && password.equals("pass")) {
            return new User("employee", "E123");
        }
        return null; // Auth failed
    }
}