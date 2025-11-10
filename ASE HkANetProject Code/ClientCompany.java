// ClientCompany.java
import java.util.ArrayList;
import java.util.List;

// This class is part of the new domain model
public class ClientCompany {

    private String companyId;
    private String companyName;

    // Association: 1-to-Many (A company has 1..* client users)
    private List<ClientUser> clientContacts;

    public ClientCompany(String id, String name) {
        this.companyId = id;
        this.companyName = name;
        this.clientContacts = new ArrayList<>();
    }

    public void addClientUser(ClientUser user) {
        if (user != null && user.getCompany() == this) {
            this.clientContacts.add(user);
        }
    }
}