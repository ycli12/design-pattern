package composite_pattern.safe;

public class Goods implements Thing{
    private double price;
    private String name;

    public Goods(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public void show() {
        System.out.println(String.format("%s 的价格是 %.2f", name, price));
    }
}
