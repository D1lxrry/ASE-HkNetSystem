// StaffBiography.java

public class StaffBiography implements ISearchableAsset {

    private String biographyID;
    private String employeeName;
    private String experienceSummary;

    // Constructor
    public StaffBiography(String id, String name, String summary) {
        this.biographyID = id;
        this.employeeName = name;
        this.experienceSummary = summary;
    }

    // Implemented methods from ISearchableAsset
    @Override
    public String getID() {
        return this.biographyID;
    }

    @Override
    public String getTitle() {
        return this.employeeName;
    }

    @Override
    public String getSummary() {
        return this.experienceSummary;
    }
}