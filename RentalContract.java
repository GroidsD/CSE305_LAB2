
public class RentalContract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    // Getters and Setters

    public void createContract() {
        // Create a rental contract
    }

    public void terminateContract() {
        // Terminate a rental contract
    }
}