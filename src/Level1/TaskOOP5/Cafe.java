package Level1.TaskOOP5;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private static Cafe instance;
    private List<Table> tables = new ArrayList<>(); // Храним столики
    private List<Reservation> reservations = new ArrayList<>(); // Храним брони

    public static Cafe getInstance(){
        if (instance == null){
            instance = new Cafe();
        }
        return instance;
    }

    // Добавление столика в кафе
    public void addTable(Table table) {
        tables.add(table);
    }

    // Бронирование столика
    public void greatReservation(Reservation reservation){
        for (Table table : tables) {
            if (table.getStatusTable() == StatusTable.FREE && table.getNumberOfSeats() >= reservation.getNumberOfClients()) {
                table.setStatusTable(StatusTable.BUSY); // Столик занят
                reservation.addTable(table);
                reservations.add(reservation);
                System.out.println("Reservation confirmed: " + reservation.getNameClient() + " for table " + table.getNumber());
                return;
            }
        }
        System.out.println("No available table for " + reservation.getNumberOfClients() + " guests.");
    }

    public void printAllReservations(){
        for (Reservation reservation : reservations){
            System.out.println(reservation.getNameClient() + " " + reservation.getNumberOfClients() + " " + reservation.getStatusReservation());
        }
    }
}
