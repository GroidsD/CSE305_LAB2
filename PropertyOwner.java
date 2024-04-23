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
public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    public User getUser() {
        return user;
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }
    
    
}
