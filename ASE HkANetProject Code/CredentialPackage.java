// CredentialPackage.java (Updated)
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CredentialPackage {

    private String packageID;
    private Date createdDate;

    // AGGREGATION relationship (1..*)
    // A package MUST have at least one asset.
    private List<ISearchableAsset> assets;

    // Association (1-to-1)
    // A package is created by exactly 1 employee
    private HkEmployee createdBy;

    public CredentialPackage(HkEmployee creator, ISearchableAsset firstAsset) {
        if (creator == null || firstAsset == null) {
            throw new IllegalArgumentException("Creator and first asset are required");
        }
        this.packageID = java.util.UUID.randomUUID().toString();
        this.createdDate = new Date();
        this.createdBy = creator;
        
        // Enforce 1..* multiplicity
        this.assets = new ArrayList<>();
        this.assets.add(firstAsset);
        
        // Update the other side of the association
        creator.addCreatedPackage(this);
    }

    // This method now adds *additional* assets
    public void addAsset(ISearchableAsset asset) {
        if (asset != null) {
            this.assets.add(asset);
        }
    }
    
    // ... other methods (removeAsset, export, etc.)
}