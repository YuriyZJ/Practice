package Level2.Chapter4.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        Predicate<Integer> predicate2 = i -> i % 4 == 0;

        FilterSort filterSort = new FilterSort();
        System.out.println(filterSort.filter1(list, predicate1));
        System.out.println(filterSort.filter2(list, predicate2));

    }
}
