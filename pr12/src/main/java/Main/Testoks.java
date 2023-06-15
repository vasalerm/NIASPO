package Main;
import org.springframework.context.annotation.*;

@Configuration
public class Testoks {
    @Bean
    public Engine zxc() {
        String inputFilePath  = "HelloTest.txt";
        String outputFilePath = "ExitTest.txt";
        return new Engine(inputFilePath, outputFilePath);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Testoks.class);
        context.getBean(Engine.class).start();
    }
}
