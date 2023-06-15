import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Controller
public class ManufactureController {
    private List<Manufacture> manufactures = new ArrayList<Manufacture>();

    public void createManufacture(String name,String address){
        Manufacture manufacture = new Manufacture(name,address);
        manufactures.add(manufacture);
    }

    public void deleteManufacture(Manufacture manufacture){
        manufactures.remove(manufacture);
    }

    public List<Manufacture> getManufactures(){
        return manufactures;
    }
}
