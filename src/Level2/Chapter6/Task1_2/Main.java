package Level2.Chapter6.Task1_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Map<Boolean, List<Integer>> map = new HashMap<>();

    FiltеrAndConcatenation filter = new FiltеrAndConcatenation();
    filter.filter(list);

    filter.concatenation();
    }
}
