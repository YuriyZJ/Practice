package Level1.TaskOOP3;

import java.util.ArrayList;
import java.util.List;

/*Функционал:
1.	Добавить заказ с нужными лекарствами.
2.	Оплатить заказ.
3.	Выдать заказ клиенту.*/

public class Pharmacy {
    private static Pharmacy instance;
    List<Order> orders = new ArrayList<>();

    public static Pharmacy instance() {
        if (instance == null) {
            instance = new Pharmacy();
        }
        return instance;
    }

    public void createOrder(Order order){
        orders.add(order);
    }

    public void printOrder() {
        for (Order order : orders) {
            order.printOrder();
        }
    }
}
