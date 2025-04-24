package Level1.TaskOOP6;

import java.util.ArrayList;
import java.util.List;

public class BikeRentalService{
    private List<Bike> bikes = new ArrayList<>(); // Список всех велосипедов
    private List<Rental> rentals = new ArrayList<>(); // Список всех аренд

    // Добавление велосипеда в систему
    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    // Получение списка доступных велосипедов
    public void printAvailableBikes() {
        System.out.println("Доступные велосипеды:");
        for (Bike bike : bikes) {
            if (bike.getStatus() == StatusBike.FREE) {
                System.out.println(bike);
            }
        }
    }

    // Получение списка активных аренд
    public void printActiveRentals() {
        System.out.println("Активные аренды:");
        for (Rental rental : rentals) {
            if (rental.isActive()) {
                System.out.println(rental);
            }
        }
    }

    // Взять велосипед в аренду
    public void rentBike(Customer customer, Bike bike) {
        if (bike.getStatus() == StatusBike.FREE) {
            Rental rental = new Rental(customer, bike);
            bike.setStatus(StatusBike.RENTAL);
            rentals.add(rental);
            System.out.println(customer.getName() + " взял в аренду " + bike.getMark());
        } else {
            System.out.println("Ошибка: Велосипед " + bike.getMark() + " уже в аренде.");
        }
    }

    // Вернуть велосипед
    public void returnBike(Bike bike) {
        for (Rental rental : rentals) {
            if (rental.getBike().equals(bike) && rental.isActive()) {
                rental.setStatus(StatusRental.CANCELLED);
                bike.setStatus(StatusBike.FREE);
                System.out.println("Велосипед " + bike.getMark() + " возвращен.");
                return;
            }
        }
        System.out.println("Ошибка: Велосипед " + bike.getMark() + " не находится в аренде.");
    }
}
