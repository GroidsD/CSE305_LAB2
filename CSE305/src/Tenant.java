import java.util.ArrayList;
import java.util.List;

public class Tenant {
    private User user;
    private List<RentalContract> listOfContracts;

    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
    }

    public User getUser() {
        return user;
    }

    public List<RentalContract> getListOfContracts() {
        return listOfContracts;
    }
    
    
}
