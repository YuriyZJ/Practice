package Level2.Chapter1.Task1;

public class Main {
    public static void main(String[] args) {
        // Создал объект статического вложенного класса
        Car.Engine engine = new Car.Engine(); //Статический вложенный класс (static class) создается без объекта внешнего класса:
        engine.start();

        // Создание объекта внешнего класса
        Car car = new Car();
        car.startCar();

        // Создание объекта нестатического вложенного класса
        Car.Transmission transmission = car.new Transmission(); //Нестатический вложенный класс (class Transmission) требует объект внешнего класса:
        transmission.changeGear(2);
    }
}
