package Level2.Chapter4.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Find find = new Find();

        List<Integer> numbers = List.of(1,2,8,4,5);
        System.out.println(find.findMax1(numbers));

        List<String> strings = List.of("a","b","c","g","e","f","c");
        System.out.println(find.findMax1(strings));
        System.out.println();

        System.out.println(find.findMax2(numbers));
        System.out.println(find.findMax2(strings));
    }
}
