
public class Property {
    private String propertyID;
    private String description;
    private PropertyOwner propertyOwner;

    public Property(String propertyID, String description, PropertyOwner propertyOwner) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwner = propertyOwner;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getDescription() {
        return description;
    }

    public PropertyOwner getPropertyOwner() {
        return propertyOwner;
    }
    
    @Override
    public String toString() {
        return "Property ID: " + propertyID + ", Description: " + description + ", Property Owner: " + propertyOwner.getUser().getUserID();
    }
    
}
