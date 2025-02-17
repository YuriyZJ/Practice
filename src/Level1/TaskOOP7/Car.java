package Level1.TaskOOP7;

public class Car {
    private int id;
    private String mark;
    private StatusCar statusCar;

    public Car(){}

    public Car(int id, String mark){
        this.id =id;
        this.mark = mark;
        this.statusCar = StatusCar.FREE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public StatusCar getStatusCar() {
        return statusCar;
    }

    public void setStatusCar(StatusCar statusCar) {
        this.statusCar = statusCar;
    }

    public void changeStatusCar(){
        /*if (statusCar == StatusCar.FREE){
            statusCar = StatusCar.RENTAL;
            System.out.println("Car is Rental");
        }*/
        this.statusCar = (this.statusCar == StatusCar.FREE) ? StatusCar.RENTAL : StatusCar.FREE; // можно таким образом
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", statusCar=" + statusCar +
                '}';
    }
}
