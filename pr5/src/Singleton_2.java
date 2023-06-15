public class Singleton_2 {
    private static Singleton_2 instance;

    private Singleton_2(){}

    public static Singleton_2 getInstance(){
        return instance;
    }
}
