package Level1.TaskOOP4;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private static Cafe instance;
    private List<Order> orders = new ArrayList<>();

    public static Cafe getInstance(){
        if (instance == null){
            instance = new Cafe();
        }
        return instance;
    }

    public void createOrder(Order order){
        orders.add(order);
    }

    public void printOrders(){
        for (Order order : orders){
            order.printItems();
        }
    }
}
