// HkEmployee.java (Concrete Class)
import java.util.ArrayList;
import java.util.List;

// HkEmployee IS-A User (Inheritance)
public class HkEmployee extends User {

    private String employeeTitle;

    // Association: 1-to-Many (An employee creates 0..* packages)
    private List<CredentialPackage> createdPackages;

    public HkEmployee(String userId, String username, String title) {
        super(userId, username); // Call the parent constructor
        this.employeeTitle = title;
        this.createdPackages = new ArrayList<>();
    }

    @Override
    public String getUserType() {
        return "Employee";
    }

    // Method to manage the association
    public void addCreatedPackage(CredentialPackage pkg) {
        this.createdPackages.add(pkg);
    }
}