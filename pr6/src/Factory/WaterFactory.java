package Factory;

public class WaterFactory{
    public water createW(WaterType type){
        water w = null;

        switch (type) {
            case BonAqua:
                w = new BonAqua();
                break;
            case Water2:
                w = new Water2();
                break;
        }
        return w;
    }
}
