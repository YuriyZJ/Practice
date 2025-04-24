package Level1.TaskOOP4;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = Cafe.getInstance();

        //Создаем заказ
        Order order1 = new Order();
        order1.addItems(new MenuItem("Бургер", 2));
        order1.addItems(new MenuItem("Кола", 2));

        Order order2 = new Order();
        order2.addItems(new MenuItem("Кофе", 150));
        order2.addItems(new MenuItem("Круассан", 120));

        //Добавляем заказ в кафе
        cafe.createOrder(order1);
        cafe.createOrder(order2);

        // Выводим заказ
        order1.printItems();
        order2.printItems();

        // Оплата и выдача
        order1.payOrder();
        order1.readyOrder();

        // Вывод всех заказов
        cafe.printOrders();
    }
}
