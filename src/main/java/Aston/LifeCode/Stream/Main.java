package Aston.LifeCode.Stream;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> listN = List.of(1,2,3,4,1,100,2);
        List<String> listS = List.of("carrot", "apple", "banana", "kiwi");
        List<Person> list = List.of(
                new Person("Alice", 17),
                new Person("Bob", 22),
                new Person("Charlie", 19),
                new Person("Dave", 25)
        );
        List<List<String>> listCh = List.of(
                List.of("apple", "banana"),
                List.of("carrot", "date"),
                List.of("eggplant")
        );


        Solution solution = new Solution();
        System.out.println("Solution 1");
        Solution.filter1(listN);

        System.out.println("Solution 2");
        Solution.length2(listS);

        System.out.println("Solution 3");
        Solution.sum3(listN);

        System.out.println("Solution 4");
        Solution.sort4(listN);

        System.out.println("Solution 5");
        Solution.findFirstWord5(listS);

        System.out.println("Solution 6");
        Solution.sortAge6(list);

        System.out.println("Solution 7");
        Solution.change7(listCh);

        System.out.println("Solution 10");
        Solution.findFirstFreeAliment10(listN);
    }
}



