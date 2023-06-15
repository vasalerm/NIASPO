package Dec;

public class coffe implements Service {
    private String label;
    private double price;
    public coffe(String label,double price){
        this.label = label;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getLabel(){
        return this.label;
    }
}
