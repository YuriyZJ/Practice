package Level1.TaskOOP7;

import java.time.LocalDate;

public class Rental {
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private StatusRental statusRental;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public StatusRental getStatusRental() {
        return statusRental;
    }

    public void setStatusRental(StatusRental statusRental) {
        this.statusRental = statusRental;
    }

    public Rental(Car car, Customer customer){
        if (car.getStatusCar() == StatusCar.FREE) {
            if (customer.isAvaliableAge()) {
                this.car = car;
                this.customer = customer;
                startDate = LocalDate.now();
                this.statusRental = StatusRental.ACTIVE;
                car.changeStatusCar();
            }
            else{
                throw new IllegalStateException("You don't have enough age");
            }
        }
            else {
                throw new IllegalStateException("All cars aren't available.");
            }
    }

    public void completeRental(){
        if (statusRental == StatusRental.ACTIVE) {
            this.statusRental = StatusRental.CANCELLED;
            car.changeStatusCar(); // Освобождаем машину
        }
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", customer=" + customer +
                ", startDate=" + startDate +
                ", statusRental=" + statusRental +
                '}';
    }
}
