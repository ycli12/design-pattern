package composite_pattern.safe;

import java.util.LinkedList;
import java.util.List;

public class Bag implements Thing {
    private List<Thing> things = new LinkedList<>();

    public void addThings(Thing thing) {
        things.add(thing);
    }

    public void removeThings(Thing thing) {
        things.remove(thing);
    }

    public double getPrice() {
        return things.stream()
                .map(Thing::getPrice)
                .reduce((price1, price2) -> (price1 + price2))
                .get();
    }


    public void show() {
        things.stream().forEach(thing -> thing.show());
    }
}
