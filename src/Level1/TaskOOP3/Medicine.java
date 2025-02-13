package Level1.TaskOOP3;

//лекарства

import java.util.Objects;

public class Medicine {
    private String name;
    private int price;

    public Medicine(){}

    public Medicine(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicine = (Medicine) o;
        return price == medicine.price && Objects.equals(name, medicine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
