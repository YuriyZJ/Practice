package Level1.TaskOOP6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rental {
    private Customer customer;
    private Bike bike;
    private LocalDate startDate;
    private StatusRental status;

    public StatusRental getStatus() {
        return status;
    }

    public void setStatus(StatusRental status) {
        this.status = status;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Rental(Customer customer, Bike bike) {
        if (bike.getStatus() == StatusBike.FREE) {
            this.customer = customer;
            this.bike = bike;
            this.startDate = LocalDate.now();
            this.status = StatusRental.ACTIVE;
            bike.rentStatusBike();
        } else {
            throw new IllegalStateException("Bike is already rented!");
        }
    }

    public void completeRental() {
        if (status == StatusRental.ACTIVE) {
            status = StatusRental.CANCELLED;
            bike.returnBike();
        } else {
            System.out.println("Rental is already completed.");
        }
    }

    public boolean isActive() {
        return status == StatusRental.ACTIVE;
    }

    @Override
    public String toString() {
        return "Rental{" + "customer=" + customer + ", bike=" + bike + ", startDate=" + startDate + ", status=" + status + '}';
    }
}
