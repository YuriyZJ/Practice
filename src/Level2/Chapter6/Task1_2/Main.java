package Level2.Chapter6.Task1_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    FiltеrAndConcatenation filter = new FiltеrAndConcatenation();
    filter.filter(list);

    filter.concatenation();
    }
}
