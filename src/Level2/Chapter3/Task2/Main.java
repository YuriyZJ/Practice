package Level2.Chapter3.Task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Audi", "BMW", "Honda", "Mercedes","Audi");

        RepeatWords rw = new RepeatWords();
        System.out.println(rw.repeatedWords1(words));
        System.out.println(rw.repeatedWords2(words));
        System.out.println(rw.repeatedWords3(words));
        System.out.println(rw.repeatedWords4(words));
    }
}
