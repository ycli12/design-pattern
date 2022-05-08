package visitor_pattern;

public class Visitor {
    public void visit(Computer computer) {
        System.out.println("正在访问 " + computer.getClass().toString());
    }

    public void visit(Mouse mouse) {
        System.out.println("正在访问 " + mouse.getClass().toString());
    }
}
