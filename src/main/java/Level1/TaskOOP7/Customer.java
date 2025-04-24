package Level1.TaskOOP7;

public class Customer {
    private String name;
    private int idC;
    private int age;

    public Customer(){}

    public Customer(String name, int idC, int age) {
        this.name = name;
        this.idC = idC;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAvaliableAge() {
        return (age > 18);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idC=" + idC +
                ", age=" + age +
                '}';
    }
}
