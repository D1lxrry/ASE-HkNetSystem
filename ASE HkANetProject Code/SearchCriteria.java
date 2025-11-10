// SearchCriteria.java
// This is a "Parameter Object".
// It is passed as a parameter, creating a Dependency.

public class SearchCriteria {

    private String keywords;
    private String assetType; // "Biography", "Project", or "All"
    private int maxResults;

    public SearchCriteria(String keywords, String assetType) {
        this.keywords = keywords;
        this.assetType = assetType;
        this.maxResults = 50; // Default
    }

    // Getters
    public String getKeywords() { return keywords; }
    public String getAssetType() { return assetType; }
    public int getMaxResults() { return maxResults; }
}