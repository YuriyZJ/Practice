package Level2.Chapter9_Spring.Task2_2;

public class Car {
    private Engine engine;

    public Car(){} // Обязателен для Spring XML конфигурации

    public Car(Engine engine) {
        this.engine = engine;
    }

    // для работы с XML, XML-конфигурация использует сеттеры по умолчанию.
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car driving" + engine.sound());
    }
}
