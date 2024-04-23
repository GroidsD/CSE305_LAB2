import java.util.ArrayList;
import java.util.List;

public class User {
	   private String userID;
	    private String password;
	    private String email;
	    private UserType userType;

	    public User(String userID, String password, String email, UserType userType) {
	        this.userID = userID;
	        this.password = password;
	        this.email = email;
	        this.userType = userType;
	    }

	    // Getters and Setters

	    public String getUserID() {
	        return userID;
	    }

	    public void setUserID(String userID) {
	        this.userID = userID;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public UserType getUserType() {
	        return userType;
	    }

	    public void setUserType(UserType userType) {
	        this.userType = userType;
	    }
	    

	    public void resetPassword() {
	        // Reset the user's password
	    } 
	    
	    @Override
	    public String toString() {
	        return "User ID: " + userID + ", Email: " + email + ", UserType: " + userType;
	    }
	}

	enum UserType {
	    PROPERTY_OWNER,
	    TENANT
	}