package Factory;

public class Main {
    public static void main(String[] args) {
        WaterFactory wf = new WaterFactory();
        WaterShop ws = new WaterShop(wf);
        ws.order(WaterType.BonAqua);

    }
}