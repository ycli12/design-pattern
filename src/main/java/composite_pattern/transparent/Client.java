package composite_pattern.transparent;



/**
 * 组合模式
 *
 * 应用场景：
 * 1、存在整体和部分的关系
 * 2、要求对用户隐藏组合对象与单个对象的不同
 *
 * 透明模式：叶子节点和非叶子节点都看作一样
 * 优点：客户无需分辨叶子节点和非叶子节点
 * 缺点：叶子节点需要实现不必要的方法，空实现/类
 */
public class Client {
    public static void main(String[] args) {
        Thing bigBagForAll = new Bag();
        Thing pen = new Goods("笔", 1.0d);
        Thing Goods = new Goods("书", 2.0d);
        Thing smallBagForCandy = new Bag();
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
