import java.util.function.Predicate;
public class Main  implements Predicate<String> {
    public boolean test(String pinCode) {
        return pinCode.matches("^\\d{4}$|^\\d{6}$");
    }
    public static void main(String[] args) {
        Predicate<String> pinCodePredicate = new Main();

        String pinCode1 = "1234";
        String pinCode2 = "123456";
        String pinCode3 = "123";
        String pinCode4 = "12345a";

        System.out.println(pinCodePredicate.test(pinCode1));
        System.out.println(pinCodePredicate.test(pinCode2));
        System.out.println(pinCodePredicate.test(pinCode3));
        System.out.println(pinCodePredicate.test(pinCode4));
    }
}