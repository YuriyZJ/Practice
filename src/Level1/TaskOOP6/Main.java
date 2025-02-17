package Level1.TaskOOP6;

public class Main {
    public static void main(String[] args) {
        BikeRentalService service = new BikeRentalService();

        Bike bike1 = new Bike(1, "Giant");
        Bike bike2 = new Bike(2, "Trek");
        service.addBike(bike1);
        service.addBike(bike2);

        Customer customer1 = new Customer("Петр", 101);

        service.printAvailableBikes(); // Вывод доступных велосипедов

        service.rentBike(customer1, bike1); // Бронирование
        service.printActiveRentals(); // Проверяем активные аренды

        service.returnBike(bike1); // Возвращаем велосипед
        service.printAvailableBikes(); // Проверяем, что велосипед снова доступен
    }
}
