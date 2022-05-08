package composite_pattern.transparent;

public interface Thing {
    double getPrice();
    void show();
    void addThings(Thing thing);
    void removeThings(Thing thing);
}
