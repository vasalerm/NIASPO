import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    //Задание 1
    private static ArrayList<String> list = new ArrayList<>();
    private static final Lock lock = new ReentrantLock();
    private static final Semaphore semaphore = new Semaphore(2);

    static void increment(String str) {
        lock.lock();
        list.add(str);
        lock.unlock();
    }

    //Задание 2
    public static void main(String[] args) throws Exception {
        //Задание 1

        Thread one = new Thread(()->{
            increment("A");
        });
        Thread two = new Thread(()->{
            increment("B");
        });
        one.start();
        two.start();

        Thread.sleep(3000);


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"Москва");
        map.put(1,"Питер");
        map.put(2,"Сочи");
        map.put(3,"Барнаул");
        map.put(4,"Кривой рог");
        map.put(5,"Анапа");




        Thread three = new Thread(()->{
            for (int i = 0; i < 2; i++) {
                try {
                    semaphore.acquire();
                    System.out.println(i+ " " + map.get(i));
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread four = new Thread(()->{
            for (int i = 2; i < 4; i++) {
                try {
                    semaphore.acquire();
                    System.out.println(i+ " " + map.get(i));
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread five = new Thread(()->{
            for (int i = 4; i < 6; i++) {
                try {
                    semaphore.acquire();
                    System.out.println(i+ " " + map.get(i));
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        three.start();
        five.start();
        four.start();







    }

}
