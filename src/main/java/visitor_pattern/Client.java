package visitor_pattern;

/**
 * 目的：分离稳定的数据结构和异变的操作
 *
 */
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Computer computer = new Computer();
        computer.accept(visitor);
    }
}
