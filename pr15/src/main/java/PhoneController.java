import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Controller
public class PhoneController {
    UserD userD = new UserD();
    private List<Phone> phones = new ArrayList<Phone>();

    public void createPhone(String name,LocalDate creationDate){
        Phone phone = new Phone(name,creationDate);
        phones.add(phone);
    }

    public void deletePhone(int phone){
        User userToDelete = userD.getUserById(phone); // Получить объект User, который нужно удалить
        userD.delete(userToDelete);
    }

    public List<Phone> getAllPhones(){
        return phones;
    }
}
