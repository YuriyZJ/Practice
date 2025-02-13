package Level1.TaskOOP3;

/*Функционал:
1.	Добавить заказ с нужными лекарствами.
2.	Оплатить заказ.
3.	Выдать заказ клиенту.*/

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = Pharmacy.instance();

        // Создаем заказ
        Order order1 = new Order();
        order1.addMedicine(new Medicine("Аспирин", 100), 2);
        order1.addMedicine(new Medicine("Анальгин", 50), 2);

        // Добавляем заказ в аптеку
        pharmacy.createOrder(order1);

        // Выводим заказ
        order1.printOrder();

        // Оплата и выдача
        order1.pay();
        order1.deliver();
        System.out.println();

        // Вывод всех заказов
        pharmacy.printOrder();
    }
}

