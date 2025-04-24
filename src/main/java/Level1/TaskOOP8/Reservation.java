package Level1.TaskOOP8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
    private Table table = new Table();
    private Customer customer = new Customer();
    private LocalDateTime dateReservation;
    private StatusReservation statusReservation;

    public Reservation(Table table, Customer customer, LocalDateTime dateReservation) {
        System.out.println("Table: " + table.getId() + " booking" + customer.getName() + " on time " + dateReservation);
        if (table.getStatusTable() == StatusTable.FREE){
            table.changeStatusTable();
            statusReservation = StatusReservation.RESERVATION;
            LocalDateTime reservationDate = LocalDateTime.of(dateReservation.getYear(), dateReservation.getMonth(), dateReservation.getDayOfMonth(), 0, 0);
        }
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public StatusReservation getStatusReservation() {
        return statusReservation;
    }

    public void setStatusReservation(StatusReservation statusReservation) {
        this.statusReservation = statusReservation;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void changeStatusReservation() {
        this.statusReservation = (statusReservation == StatusReservation.RESERVATION) ? StatusReservation.COMPLETE : StatusReservation.RESERVATION;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "table=" + table +
                ", customer=" + customer +
                ", dateReservation=" + dateReservation +
                ", statusReservation=" + statusReservation +
                '}';
    }
}
