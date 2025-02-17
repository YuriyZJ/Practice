package Level1.TaskOOP8;

public class Table {
    private int id;
    private int numberOfSeats;
    private StatusTable statusTable;

    public Table(){}

    public Table(int id, int numberOfSeats, StatusTable statusTable){
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.statusTable = StatusTable.FREE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void changeStatusTable(){
        this.statusTable = (statusTable == StatusTable.FREE) ? StatusTable.BOOKED : StatusTable.FREE;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", numberOfSeats=" + numberOfSeats +
                ", statusTable=" + statusTable +
                '}';
    }
}
