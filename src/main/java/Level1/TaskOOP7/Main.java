package Level1.TaskOOP7;

import Level1.TaskOOP6.BikeRentalService;

public class Main {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();

        Car car1 = new Car(1, "Car1");
        Car car2 = new Car(2, "Car2");
        Car car3 = new Car(3, "Car3");

        Customer customer1 = new Customer("Petr", 1, 5);
        Customer customer2 = new Customer("Ivan", 2, 19);
        Customer customer3 = new Customer("Harry", 3, 20);

        carRentalService.addCar(car1);
        carRentalService.addCar(car2);
        carRentalService.addCar(car3);

        carRentalService.giveRentalCar(car1, customer2);
        carRentalService.giveRentalCar(car2, customer3);

        carRentalService.returnRentalCar(car1);
        System.out.println();

        carRentalService.printRental();
        carRentalService.printFreeCar();
    }
}
