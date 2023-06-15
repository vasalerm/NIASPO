import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Controller
public class ManufactureController {
    UserD userD = new UserD();
    private List<Manufacture> manufactures = new ArrayList<Manufacture>();

    public void createManufacture(String name,String address){
        Manufacture manufacture = new Manufacture(name,address);
        User user1 = new User();
        user1.setName(String.valueOf(name));
        userD.addUser(user1);
    }

    public void deleteManufacture(Manufacture manufacture){
        manufactures.remove(manufacture);
    }

    public List<Manufacture> getManufactures(){
        List<User> users = userD.getAllUsers();
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getId());
        }
        return manufactures;
    }
}
