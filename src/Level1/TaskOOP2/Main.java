package Level1.TaskOOP2;

public class Main {
    public static void main(String[] args) {
        Shop shop = Shop.getInstance();

        shop.add(new Goods("Паста", 10, 1));
        shop.add(new Goods("Батон", 2, 1));
        shop.add(new Goods("Щетка", 1, 1));
        shop.add(new Goods("Молоко", 1, 1));
        shop.add(new Goods("Рыба", 1, 1));

        shop.update("Рыба", 2);

        shop.printAllGoods();
    }
}
