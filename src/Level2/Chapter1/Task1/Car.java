package Level2.Chapter1.Task1;

public class Car {

    static class Engine {
        public void start(){
            System.out.println("Engine start");
        }
    }

    Engine engine = new Engine();

    public void startCar(){
        engine.start();
    }

    class Transmission {
        public void changeGear(int gear){
            System.out.println("Transmission change gear " + gear);
        }
    }
}
