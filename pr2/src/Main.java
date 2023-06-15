import sem2.PR1.Human;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Human t1 = new Human(21,90,"Василий","А","14.01.2003");
        Human t2 = new Human(90,60,"Василий","Б","14.01.2003");
        Human human;
        List<Human> humans = new ArrayList<>();
        humans.add(t1);
        humans.add(t2);
        Stream<Human> stream = humans.stream();
        System.out.println("Фильтр вес > возраста");
        t1.filter(stream);
        System.out.println("Сортировка по фамилии в обратном порядке");
        Stream<Human> stream1 = humans.stream();
        t1.sort(stream1);
        Stream<Human> stream2 = humans.stream();
        System.out.println("Сумма всех весов");
        System.out.println("Сумма: " + t1.sumWeight(stream2));


    }
}