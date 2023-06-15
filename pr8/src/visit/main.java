package visit;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Iplace> pl = new ArrayList<>();
        pl.add(new Zoo());
        pl.add(new Cinema());
        pl.add(new Circus());

        for(Iplace plase : pl) {
            Human hm = new Human();
            plase.accept(hm);
            System.out.println(hm.value);
        }
    }
}
