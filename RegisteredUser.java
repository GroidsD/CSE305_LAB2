import java.util.ArrayList;
import java.util.List;

public class RegisteredUser {
    private List<User> listOfUsers;

    public RegisteredUser() {
        this.listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void removeUser(User user) {
        listOfUsers.remove(user);
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }
    
    
}
