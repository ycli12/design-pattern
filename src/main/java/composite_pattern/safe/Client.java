package composite_pattern.safe;

import sun.java2d.windows.GDIBlitLoops;

/**
 * 安全模式
 *
 */
public class Client {
    public static void main(String[] args) {
        Bag bigBagForAll = new Bag();
        Goods pen = new Goods("笔", 1.0d);
        Goods Goods = new Goods("书", 2.0d);
        Bag smallBagForCandy = new Bag();
        for (int i = 0; i < 10; i++) {
            smallBagForCandy.addThings(new Goods("糖果", 0.1d));
        }
        bigBagForAll.addThings(pen);
        bigBagForAll.addThings(Goods);
        bigBagForAll.addThings(smallBagForCandy);

        System.out.println("总价是：" + bigBagForAll.getPrice());
        System.out.println("总共的物品有：");
        bigBagForAll.show();
    }
}
