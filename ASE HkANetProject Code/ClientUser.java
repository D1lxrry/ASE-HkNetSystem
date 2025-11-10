// ClientUser.java (Concrete Class)
// ClientUser IS-A User (Inheritance)
public class ClientUser extends User {

    // Association: Many-to-1 (This user belongs to exactly 1 company)
    private ClientCompany company;

    public ClientUser(String userId, String username, ClientCompany company) {
        super(userId, username);
        this.company = company;
        
        // This enforces the 1..* multiplicity on the ClientCompany side
        if (company != null) {
            company.addClientUser(this);
        }
    }

    @Override
    public String getUserType() {
        return "Client";
    }
    
    public ClientCompany getCompany() {
        return this.company;
    }
}