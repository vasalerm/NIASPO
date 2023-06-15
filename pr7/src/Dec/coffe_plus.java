package Dec;

public class coffe_plus implements Service {
    private Service service;
    private String Label;
    private double price;

    public coffe_plus(Service service,String label,double price){
        this.service = service;
        this.Label = label;
        this.price = price;
    }

    public String getLabel(){
        return this.Label +  service.getLabel();
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }
}
