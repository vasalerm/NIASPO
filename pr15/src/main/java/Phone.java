import java.time.LocalDate;
public class Phone {
    private String name;
    private LocalDate creationDate;

    public Phone(String name,LocalDate creationDate){
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName(){
        return name;
    }

    public LocalDate getCreationDate(){
        return  creationDate;
    }
}
