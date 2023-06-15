package Flyweight;

public class main {
    public static void main(String[] args) {
        int rows = 5;
        Factory theFactory = new Factory(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                theFactory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
    }
}
