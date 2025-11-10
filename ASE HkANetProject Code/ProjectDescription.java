// ProjectDescription.java

public class ProjectDescription implements ISearchableAsset {

    private String projectID;
    private String projectName;
    private String projectDetails;

    // Constructor
    public ProjectDescription(String id, String name, String details) {
        this.projectID = id;
        this.projectName = name;
        this.projectDetails = details;
    }

    // Implemented methods from ISearchableAsset
    @Override
    public String getID() {
        return this.projectID;
    }

    @Override
    public String getTitle() {
        return this.projectName;
    }

    @Override
    public String getSummary() {
        return this.projectDetails;
    }
}