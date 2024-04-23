/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
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
