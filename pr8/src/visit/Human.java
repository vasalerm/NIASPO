package visit;

public class Human implements IVisitor{
    public String value;
    @Override
    public void visit(Zoo zoo) {
        value = "Слон";
    }

    @Override
    public void visit(Cinema cinema) {
        value ="Кино";
    }

    @Override
    public void visit(Circus circus) {
        value = "Клоун";
    }
}
