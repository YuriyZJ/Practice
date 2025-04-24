package Level2.Chapter6.Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        List<String> listCar = Arrays.asList("Audi", "BMW", "Honda");

        sortList.sort(listCar);
        System.out.println(listCar);
    }
}
