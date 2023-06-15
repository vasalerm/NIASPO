package PR_13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Tool implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        printStudentInfo();
    }
    public void printStudentInfo() {
        Environment env = context.getEnvironment();
        String name = env.getProperty("student.name");
        String lastName = env.getProperty("student.last_name");
        String group = env.getProperty("student.group");
        System.out.printf("Student info: name = %s, last_name = %s, group = %s", name, lastName, group);
    }
}
