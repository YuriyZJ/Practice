package Level1.TaskOOP5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reservation {
    private String nameClient;
    private int numberOfClients;
    private StatusReservation statusReservation = StatusReservation.PENDING;
    List<Table> tables = new ArrayList<>();

    public Reservation(){}

    public Reservation(String nameClient, int numberOfClients, StatusReservation statusReservation) {
        this.nameClient = nameClient;
        this.numberOfClients = numberOfClients;
        this.statusReservation = statusReservation;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public StatusReservation getStatusReservation() {
        return statusReservation;
    }

    public void setStatusReservation(StatusReservation statusReservation) {
        this.statusReservation = statusReservation;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public void reserve(){
        if (statusReservation == StatusReservation.PENDING){
            statusReservation = StatusReservation.CONFIRMED;
            System.out.println("Reservation has been confirmed");
        }
        else {
            System.out.println("Reservation has not been confirmed");
        }
    }

    public void cancelReservation(){
        if (statusReservation == StatusReservation.CONFIRMED){
            statusReservation = StatusReservation.CANCELLED;
            System.out.println("Reservation has been cancelled");
        }
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void printTables() {
        for (Table table : tables) {
            System.out.println(table.getNumber() + " " + table.getNumberOfSeats() + " " + table.getStatusTable());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return numberOfClients == that.numberOfClients && Objects.equals(nameClient, that.nameClient) && statusReservation == that.statusReservation && Objects.equals(tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameClient, numberOfClients, statusReservation, tables);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nameClient='" + nameClient + '\'' +
                ", numberOfClients=" + numberOfClients +
                ", statusReservation=" + statusReservation +
                ", table=" + tables +
                '}';
    }
}
