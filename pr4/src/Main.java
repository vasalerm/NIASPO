import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        exc ex = new exc(2,"pool 1","pool 2","pool 3",5);
        ex.func();

    }
}