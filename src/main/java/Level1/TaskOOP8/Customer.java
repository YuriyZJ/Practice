package Level1.TaskOOP8;

public class Customer {
    private String name;
    private String numberPhone;

    public Customer(){}

    public Customer(String name, String numberPhone){
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
