package Level1.TaskOOP6;

import java.util.Objects;

public class Bike {
    private int id;
    private String mark;
    private StatusBike status;

    public Bike(){}

    public Bike(int id, String mark){
        this.id = id;
        this.mark = mark;
        this.status = StatusBike.FREE; // По умолчанию велосипед свободен
    }

    public int gerId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public StatusBike getStatus() {
        return status;
    }

    public void setStatus(StatusBike status) {
        this.status = status;
    }

    public void rentStatusBike(){
        if (status == StatusBike.FREE){
            status = StatusBike.RENTAL;
            System.out.println("Bike " + mark + " is now rented.");
        }
        else{
            System.out.println("Bike " + mark + " is already rented.");
        }
    }

    public void returnBike() {
        if (status == StatusBike.RENTAL) {
            status = StatusBike.FREE;
            System.out.println("Bike " + mark + " is now available.");
        } else {
            System.out.println("Bike " + mark + " was not rented.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return id == bike.id && Objects.equals(mark, bike.mark) && status == bike.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, status);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", status=" + status +
                '}';
    }
}
