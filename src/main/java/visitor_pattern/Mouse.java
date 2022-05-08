package visitor_pattern;

public class Mouse implements ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
