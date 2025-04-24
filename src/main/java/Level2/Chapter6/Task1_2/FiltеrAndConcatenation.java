package Level2.Chapter6.Task1_2;

import java.util.List;
import java.util.function.Function;

public class FiltеrAndConcatenation {

    public void filter(List<Integer> list) {
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    public void concatenation(){
        Function<String, String> concat = x -> x.concat("!");
        //System.out.println(concat);
        System.out.println(concat.apply("Hello"));
    }
}
