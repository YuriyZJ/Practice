package Level1.TaskOOP2;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private static Shop instance;
    Map<String, Goods> goodsMap = new HashMap<>();

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public void add(Goods goods) {
        if (goodsMap.containsKey(goods.getName())) {
            Goods existing = goodsMap.get(goods.getName());
            existing.setQuantity(existing.getQuantity() + goods.getQuantity());
        } else {
            goodsMap.put(goods.getName(), goods);
        }
    }

    public void update(String name, int addQuantity) {
        if (goodsMap.containsKey(name)) { //Проверяем, есть ли товар в магазине
            Goods goods = goodsMap.get(name); // Получаем товар из HashMap
            goods.setQuantity(goods.getQuantity() + addQuantity);   // Обновляем его количество
        } else {
            System.out.println("Товар не найден!"); // 4️⃣ Если товара нет, сообщаем об этом
        }
    }

    public void printAllGoods(){
        for (Goods goods : goodsMap.values()) {
            System.out.println(goods.getName() + " - Цена: " + goods.getPrice() + " - Кол-во: " + goods.getQuantity());
        }
    }
}
