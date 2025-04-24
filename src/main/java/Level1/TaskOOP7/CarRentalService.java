package Level1.TaskOOP7;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> cars = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void giveRentalCar(Car car, Customer customer) {
        if(car.getStatusCar() == StatusCar.FREE){
            Rental rental = new Rental(car, customer);
            rental.setStatusRental(StatusRental.ACTIVE);
            car.changeStatusCar();
            rentals.add(rental);
            System.out.println("Car give rental successfully");
        }
        else {
            System.out.println("Unsuccessful rental");
        }
    }

    public void returnRentalCar(Car car) {
        for (Rental rental: rentals) {
            if (rental.getCar().equals(car) && rental.getStatusRental() == StatusRental.ACTIVE) {
                rental.completeRental();
                System.out.println("Car" + car.getMark() + " возвращен.");
            }
        }
    }

    public void printFreeCar() {
        System.out.println("List of free cars");
        for (Car c : cars){
            if (c.getStatusCar() == StatusCar.FREE){
                System.out.println(c.toString());
            }
        }
    }

    public void printRental() {
        System.out.println("List of rentals");
        for (Rental r : rentals){
            if (r.getStatusRental() == StatusRental.ACTIVE){
                System.out.println(r.toString() + " " + r.getCustomer().getName());
            }
        }
    }
}
