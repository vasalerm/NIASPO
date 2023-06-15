package sem2.PR1;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Human {
    private  int age;
    int weight;
    private String firstName;
    private String lastName;
    private String birthDate;

    public Human(int age,int weight,String firstName,String lastName,String birthDate){
        this.age = age;
        this.weight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }
    public String getLastName(){
        return lastName;
    }

    public int getWeight(){
        return weight;
    }




    public void filter(Stream<Human> stream){
        stream.filter(human -> human.weight > human.age )
                .forEach(System.out::println);
    }

    public void sort(Stream<Human> stream){
        stream.sorted(Comparator.comparing(Human::getLastName).reversed())
                .forEach(System.out::println);
    }

    public int sumWeight(Stream<Human> stream){
            return stream.mapToInt(Human::getWeight).sum();
    }

    @Override
    public String toString() {
        return "Имя: " + age + " Фамилия: " + lastName + " Возраст: " + age + " Вес: " +  weight;
    }
}
