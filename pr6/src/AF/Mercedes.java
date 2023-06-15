package AF;

public class Mercedes implements Carsshop{
    public Coupe creatCoup(){
        return new MercedesCoupe();
    }
    public Sedan createSedan(){
        return new MercedesSedan();

    }
}
