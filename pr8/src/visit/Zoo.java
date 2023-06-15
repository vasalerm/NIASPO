package visit;

class Zoo implements Iplace{
    public void accept(IVisitor v) {
        v.visit(this);

    }
}
