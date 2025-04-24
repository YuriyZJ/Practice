package Level1.Task5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FilterList filterList = new FilterList(Arrays.asList("apple", "banana", "cherry", "date", "fig"));


        List<String> longWords = filterList.filter(5);
        System.out.println("Слова длиннее 5 символов: " + longWords);
    }
}
