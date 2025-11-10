// ISearchableAsset.java
// This interface represents the Generalization relationship.
// Any class that implements it can be treated as an "ISearchableAsset".

public interface ISearchableAsset {
    String getID();
    String getTitle();
    String getSummary();
}