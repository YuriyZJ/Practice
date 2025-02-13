package Level1.TaskOOP3;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int orderID;
    private OrderStatus status = OrderStatus.NEW; // Новый заказ по умолчанию
    Map<Medicine, Integer> medicines = new HashMap<>();

    public Order(){}

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public Map<Medicine, Integer> getMedicines() {
        return medicines;
    }

    public void setMedicines(Map<Medicine, Integer> medicines) {
        this.medicines = medicines;
    }

    public void addMedicine (Medicine medicine, int quantity){
        this.medicines.put(medicine, quantity);
    }

    public void pay() {
        if (status == OrderStatus.NEW) {
            status = OrderStatus.PAID;
            System.out.println("Заказ оплачен.");
        } else {
            System.out.println("Заказ уже оплачен или выдан.");
        }
    }

    public void deliver(){
        if (status == OrderStatus.PAID){
            status = OrderStatus.DELIVERED;
            System.out.println("Заказ доставлен");
        }
        else{
            System.out.println("Сначала оплатите заказ.");
        }
    }

    public void printOrder() {
        System.out.println("Заказ (" + status + "):");
        for (Medicine medicine : medicines.keySet()) {
            System.out.println("  - " + medicine);
        }
        System.out.println();
    }
}
