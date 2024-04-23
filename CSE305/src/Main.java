public class Main {

	public static void main(String[] args) {
		// Create users
		User user1 = new User("Thanh Duy", "120602", "duy.nguyen.cit20@eiu.edu.vn", UserType.PROPERTY_OWNER);
		User user2 = new User("Thanh Nam", "159753", "nam.nguyen.cit20@eiu.edu.vn", UserType.TENANT);

		// Create registered user
		RegisteredUser registeredUser = new RegisteredUser();
		registeredUser.addUser(user1);
		registeredUser.addUser(user2);

		// Create property owner
		PropertyOwner propertyOwner = new PropertyOwner(user1);

		// Create properties
		Property property1 = new Property("01", "Apartment", propertyOwner);
		Property property2 = new Property("02", "HomeStay", propertyOwner);

		// Add properties to property owner
		propertyOwner.addProperty(property1);
		propertyOwner.addProperty(property2);

		// Create tenant
		Tenant tenant = new Tenant(user2);

		// Create rental contract
		RentalContract contract = new RentalContract("c1", property1.getPropertyID(), tenant.getUser().getUserID(),1000.0);

		// Request rental contract creation
		tenant.requestCreateRentalContract(contract);

		// Request termination of rental contract
		tenant.requestTerminateRentalContract(contract);

		// Print some information for demonstration
		System.out.println("User 1: " + user1.getUserID());
		System.out.println("User 2: " + user2.getUserID());
		
		System.out.println("Registered Users:");
		
		registeredUser.getListOfUsers().forEach(user -> System.out.println("\t" + user));
		System.out.println("Properties:");
		
		propertyOwner.getListOfProperties().forEach(property -> System.out.println("\t" + property));
		
		System.out.println("Tenant: " + tenant.getUser().getUserID());
		
		System.out.println("Rental Contracts: " + tenant.getListOfContracts());
	}
}