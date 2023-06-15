package visit;

public class Circus implements Iplace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
