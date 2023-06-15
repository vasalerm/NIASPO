import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        PhoneController phoneController = new PhoneController();
        ManufactureController manufactureController = new ManufactureController();
        System.out.println("Welcome! \n" +
                " Choose what you want to do:\n" +
                "1)Creation \n" +
                "2)Removal\n" +
                "3)Output all");
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("\nEnter: ");
            int myint = keyboard.nextInt();
            switch (myint) {
                case 1:
                    System.out.println("1)Phone \n2)Manufacture");
                    System.out.println("\nEnter: ");
                    int myint5 = keyboard.nextInt();
                    if (myint5 == 1){
                        System.out.println("Enter the name of the Phone: ");
                        Scanner keyboard2 = new Scanner(System.in);
                        String str = keyboard2.nextLine();
                        phoneController.createPhone(str, LocalDate.now());
                    }
                    else{
                        System.out.println("Enter the name of the Manufacture: ");
                        Scanner keyboard23 = new Scanner(System.in);
                        String str2 = keyboard23.nextLine();
                        System.out.println("Enter the address of the Manufacture: ");
                        String str3 = keyboard23.nextLine();
                        manufactureController.createManufacture(str2, str3);
                    }
                    break;
                case 2:
                    Scanner keyboard42 = new Scanner(System.in);
                    System.out.println("Enter:");
                    System.out.println("1)Phone\n2)Manufacture");
                    int myint1 = keyboard42.nextInt();
                    System.out.println("Choose what to delete: ");
                    int myint2 = keyboard42.nextInt();
                    if(myint1 == 1){
                        System.out.println("1");
                        phoneController.deletePhone(phoneController.getAllPhones().get(myint2));
                        System.out.println("2");
                    }
                    else if(myint1 == 2){
                        manufactureController.deleteManufacture(manufactureController.getManufactures().get(myint2));
                    }

//                    System.out.println("All Phones after deletion:");
//                    for (Phone phone : phoneController.getAllPhones()) {
//                        System.out.println(phone.getName() + "\t" + phone.getCreationDate());
//                    }
//
//                    System.out.println("All Manufactures after deletion:");
//                    for (Manufacture manufacture : manufactureController.getManufactures()) {
//                        System.out.println(manufacture.getName() + "\t" + manufacture.getAddress());
//                    }
                    break;
                case 3:
                    System.out.println("All phones:");
                    for (Phone phone : phoneController.getAllPhones()) {
                        System.out.println(phone.getName() + "\t" + phone.getCreationDate());
                    }
                    System.out.println("All Manufactures:");
                    for (Manufacture manufacture : manufactureController.getManufactures()) {
                        System.out.println(manufacture.getName() + "\t" + manufacture.getAddress());
                    }
                    break;
            }
        }
    }
}
