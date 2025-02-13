package Level1.TaskOOP4;

/*
1.Создать заказ и добавить в него блюда.
2.Оплатить заказ.
3.Отметить заказ как готовый.*/

import java.util.ArrayList;

//Добавляет блюда, оплачивается и становится готовым.

public class Order {
    private OrderStatus statusOrder = OrderStatus.NEW;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void payOrder() {
        if (statusOrder == OrderStatus.NEW) {
            statusOrder = OrderStatus.PAID;
            System.out.println("Order payed successfully");
        } else {
            System.out.println("Order payed unsuccessfully");
        }
    }

    public void readyOrder(){
        if (statusOrder == OrderStatus.PAID){
            statusOrder = OrderStatus.READY;
            System.out.println("Order ready successfully");
        } else {
            System.out.println("Order ready unsuccessfully");
        }
    }

    public void addItems(MenuItem menuItem){
        items.add(menuItem);
    }

    public void printItems(){
        System.out.println("Заказ (" + statusOrder + "):");
        for (MenuItem item : items) {
            System.out.println("  - " +item);
        }
        System.out.println("-----------------------------");
    }
}
