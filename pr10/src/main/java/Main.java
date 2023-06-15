import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a bean name as a command-line argument");
            return;
        }

        String beanName = args[0];

        // Создание ApplicationContext из файла applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получение бина по его имени
        Printer printer = (Printer) context.getBean(beanName);

        // Вызов метода doPrint()
        printer.doPrint();
    }
}
