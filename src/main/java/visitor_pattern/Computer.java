package visitor_pattern;

import java.util.LinkedList;

public class Computer implements ComputerPart {
    LinkedList<ComputerPart> parts = new LinkedList<>();

    public Computer() {
        parts.add(new Mouse());
    }

    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}
