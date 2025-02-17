package Level1.TaskOOP8;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        RestaurantBookingService restaurantBookingService = RestaurantBookingService.getInstance();

        // Создаём столы
        Table table1 = new Table(1, 4, StatusTable.FREE);
        Table table2 = new Table(2, 2, StatusTable.FREE);
        Table table3 = new Table(3, 6, StatusTable.FREE);

        restaurantBookingService.addTable(table1);
        restaurantBookingService.addTable(table2);
        restaurantBookingService.addTable(table3);

        // Создаём клиентов
        Customer customer1 = new Customer("Иван", "+803355444123");
        Customer customer2 = new Customer("Мария", "+78882223344");

        // Выводим список доступных столов
        restaurantBookingService.printFreeTables();

        // Бронируем стол №1 на текущее время
        restaurantBookingService.addReservation(table1, customer1, LocalDateTime.of(2025,10,10,18,00));

        // Выводим список активных бронирований
        restaurantBookingService.printReservations();

        // Выводим список доступных столов после брони
        restaurantBookingService.printFreeTables();
    }
}
