package visit;

public class Cinema implements Iplace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
