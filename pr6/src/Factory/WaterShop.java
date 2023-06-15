package Factory;

public class WaterShop {
    public final WaterFactory waterFactory;
    public WaterShop(WaterFactory waterFactory){
        this.waterFactory = waterFactory;
    }
    public water order(WaterType type){
        water Water = waterFactory.createW(type);
        Water.addlimon();
        Water.makesoda();
        System.out.println("Ваша вода!");
        return Water;
    }
}
