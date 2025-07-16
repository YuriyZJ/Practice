package Aston.LifeCode.Stream;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> listN = List.of(1,2,3,4,1,100,2);
        List<String> listS = List.of("apple", "banana", "kiwi");

        Solution solution = new Solution();
        Solution.filter(listN);
        System.out.println();

        Solution.length(listS);
        System.out.println();

        //

        Solution.sort(listN);
        System.out.println();
    }
}



