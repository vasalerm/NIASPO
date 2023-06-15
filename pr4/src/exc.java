import java.util.concurrent.*;

public class exc {
    private int col;
    private String name_1;
    private String name_2;
    private String name_3;

    public exc(int col,String name_1,String name_2,String name_3,int col_que){
        this.col = col;
        this.name_1 = name_1;
        this.name_2 = name_2;
        this.name_3 = name_3;

    }

    public void func(){
        ExecutorService executorService =
                Executors.newFixedThreadPool(col);

        executorService.submit(() -> {
            Thread.currentThread().setName(name_1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it" + " | pool name: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            Thread.currentThread().setName(name_2);
            System.out.println("Start" + " | pool name: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            Thread.currentThread().setName(name_3);
            System.out.println("Start1" + " | pool name: " + Thread.currentThread().getName());
        });
    }
}
