package Level1.TaskOOP5;

import java.util.Objects;

public class Table {
    private int number;
    private int numberOfSeats;
    private StatusTable statusTable = StatusTable.FREE;

    public Table(){}

    public Table(int number, int numberOfSeats, StatusTable statusTable) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.statusTable = statusTable;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public StatusTable getStatusTable() {
        return statusTable;
    }

    public void setStatusTable(StatusTable statusTable) {
        this.statusTable = statusTable;
    }

    public void booking(){
        if (statusTable == StatusTable.FREE){
            statusTable = StatusTable.BUSY;
            System.out.println("Table booked!");
        }
        else {
            System.out.println("Table not booked!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return number == table.number && numberOfSeats == table.numberOfSeats && statusTable == table.statusTable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, numberOfSeats, statusTable);
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", numberOfSeats=" + numberOfSeats +
                ", statusTable=" + statusTable +
                '}';
    }
}
