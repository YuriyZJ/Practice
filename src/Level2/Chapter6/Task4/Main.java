package Level2.Chapter6.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ListConverter list = new ListConverter();
        List<String> car = Arrays.asList("1", "2", "3");
        Function<String, Integer> converter = Integer::parseInt;

        System.out.println(list.convert1(car, converter));
        System.out.println(list.convert2(car, converter));
    }
}
