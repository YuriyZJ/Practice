package Level1.TaskOOP8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RestaurantBookingService {
    private static RestaurantBookingService instance;
    private List<Table> tables = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1); //Это объект планировщика задач, который позволяет выполнять код через определённое время или периодически.
    //Используется для автоматического выполнения кода без создания отдельных потоков вручную.

    public static RestaurantBookingService getInstance() {
        if (instance == null){
            instance = new RestaurantBookingService();
        }
        return instance;
    }

    public void addTable(Table table){
        tables.add(table);
    }

    public void addReservation(Table table, Customer customer, LocalDateTime dateTime) {
        if (table.getStatusTable() == StatusTable.FREE) {
            Reservation reservation = new Reservation(table, customer, dateTime);
            reservations.add(reservation);
            table.changeStatusTable();
            System.out.println("Table " + table.getId() + " booked successfully!");

            // Запускаем проверку через 15 минут
            scheduleReservationCheck(reservation);
        } else {
            System.out.println("Table is not FREE");
        }
    }

    private void scheduleReservationCheck(Reservation reservation) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                if (reservation.getStatusReservation() == StatusReservation.RESERVATION &&
                        reservation.getDateReservation().plusMinutes(15).isBefore(LocalDateTime.now())) {
                    cancelReservation(reservation);
                    System.out.println("Reservation for table " + reservation.getTable().getId() + " was cancelled due to no-show.");
                }
            }
        };

        long delay = TimeUnit.MINUTES.toSeconds(15);  // Задержка 15 минут
        scheduler.schedule(task, delay, TimeUnit.SECONDS);
    }

    public void cancelReservation(Reservation reservation) {
        reservation.getTable().changeStatusTable();
        reservations.remove(reservation);
        System.out.println("Reservation cancelled for table " + reservation.getTable().getId());
    }

    public void printFreeTables(){
        System.out.println("List of free tables:");
        for (Table table : tables){
            if (table.getStatusTable() == StatusTable.FREE){
                System.out.println(table);
            }
        }
    }

    public void printReservations(){
        System.out.println("List of active reservations:");
        for (Reservation reservation : reservations){
            if (reservation.getStatusReservation() == StatusReservation.RESERVATION){
                System.out.println(reservation.toString());
            }
        }
    }
}
