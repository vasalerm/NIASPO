import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Controller
public class PhoneController {
    private List<Phone> phones = new ArrayList<Phone>();

    public void createPhone(String name,LocalDate creationDate){
        Phone phone = new Phone(name,creationDate);
        phones.add(phone);
    }

    public void deletePhone(Phone phone){
        phones.remove(phone);
    }

    public List<Phone> getAllPhones(){
        return phones;
    }
}
