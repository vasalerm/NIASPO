package Dec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choise=100;
        int res = 0;
        System.out.println("Меню");
        System.out.println("=============");
        System.out.println("Кофе - 1000");
        System.out.println("Чай - 1500");
        System.out.println("Добавки:");
        System.out.println("Молоко - 100");
        System.out.println("Сахар - 30");
        System.out.println("Карамельный сироп - 120");
        System.out.println("=============\n");
        while(choise!=0){
            int add_pr = 0;
            String name = null;
            System.out.println("Что вы хотите заказать ?");
            System.out.println("1 - Кофе");
            System.out.println("2 - Чай");
            System.out.println("0 - Завершить выбор");
            System.out.print("Ваш выбор: ");
            choise = scan.nextInt();
            if(choise == 0){
                continue;
            }
            int choise_vrem = 100;
            System.out.println("Нужны ли вам добавки ?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            System.out.print("Ваш выбор: ");
            choise_vrem = scan.nextInt();
            if(choise_vrem == 1){
                if(choise == 1) {
                    name = "кофе";
                } else if (choise == 2) {
                    name = "чай";
                }
                System.out.println("Что хотите добавить в ваш " + name + " ?" );
                System.out.println("1 - Молоко ");
                System.out.println("2 - Сахар");
                System.out.println("3 - Караменльный сироп");
                System.out.print("Ваш выбор: ");
                choise_vrem = scan.nextInt();
                if(choise_vrem == 1 ){
                    add_pr += 100;
                } else if (choise_vrem ==2) {
                    add_pr += 30;
                } else if (choise_vrem ==3) {
                    add_pr += 120;
                }
            }




            if(choise == 1){

                Service coffe1 = new coffe("Кофе",1000+add_pr);
                Service two1 = new auta(coffe1);
                res +=two1.getPrice();
            } else if (choise == 2) {
                Service coffe2 = new coffe("Чай",1500+add_pr);
                Service two2 = new auta(coffe2);
                res+=two2.getPrice();

            }

        }
        System.out.print("\nВаш чек: ");
        System.out.println(res);
    }

}

//Сделать заказ через консоль