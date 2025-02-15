package Level1.TaskOOP5;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = Cafe.getInstance();

/*        // Создаем заказы
        Reservation reservation1 = new Reservation("Анна", 5, StatusReservation.PENDING);
        Reservation reservation2 = new Reservation("Иван", 3, StatusReservation.PENDING);
        Reservation reservation3 = new Reservation("Мария", 8, StatusReservation.PENDING);

        // Создаем столы
        Table table1 = new Table(1, 5, StatusTable.FREE);
        Table table2 = new Table(2, 10, StatusTable.FREE);
        Table table3 = new Table(3, 25, StatusTable.FREE);

        // Добавляем столы в заказы
        reservation1.addTable(table1);
        reservation2.addTable(table2);
        reservation3.addTable(table3);

        // Выводим список столов до бронирования
        System.out.println("До бронирования:");
        reservation1.printTables();
        reservation2.printTables();
        reservation3.printTables();

        // Бронируем стол 1 и 2
        System.out.println("\nБронируем столы:");
        table1.booking();
        table2.booking();

        // Выводим список столов после бронирования
        System.out.println("\nПосле бронирования:");
        reservation1.printTables();
        reservation2.printTables();
        reservation3.printTables();

        // Добавляем заказы в кафе
        cafe.greatReservation(reservation1, table1);
        cafe.greatReservation(reservation2, table2);
        cafe.greatReservation(reservation3, table3);

        System.out.println("Проверка всего");
        Reservation reservation4 = new Reservation("Никита", 5, StatusReservation.PENDING);
        Table table4 = new Table(1, 4, StatusTable.FREE);
        reservation4.addTable(table4);
        cafe.greatReservation(reservation4, table4);

        System.out.println("Все заказы");
        cafe.printAllReservations();*/

        // Добавляем столики в кафе
        cafe.addTable(new Table(1, 4, StatusTable.FREE));
        cafe.addTable(new Table(2, 6, StatusTable.FREE));
        cafe.addTable(new Table(3, 2, StatusTable.FREE));

        // Клиенты бронируют столики
        cafe.greatReservation(new Reservation("Анна", 3, StatusReservation.PENDING));
        cafe.greatReservation(new Reservation("Иван", 7, StatusReservation.PENDING));
        cafe.greatReservation(new Reservation("Мария", 2, StatusReservation.PENDING));

        // Выводим список всех броней
        System.out.println("\nВсе бронирования:");
        cafe.printAllReservations();
    }
}
