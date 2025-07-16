package Aston.LifeCode.Stream;

import java.util.Comparator;
import java.util.List;

public class Solution {

    // Из списка List<Integer> получить список только четных чисел.
    public static void filter(List<Integer> listF){
        listF.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    // Преобразовать List<String> в List<Integer>, содержащий длины строк.
    public static void length(List<String> listL){
        listL.stream().map(x -> x.length()).forEach(System.out::println);
    }

    /*// Найти сумму всех элементов в списке List<Integer>.
    public static void sum(List<String> listS){
        listS.stream().reduce(0, Integer::sum).forEach(System.out::println); //???
    }*/

    //Из List<String> получить отсортированный список уникальных значений.
    public static void sort(List<Integer> listS){
        listS.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }

    //Из List<String> найти первое слово, начинающееся на букву "A" (или вернуть null/Optional.empty()).
    public static void findFirstWord(List<String> listF){
        listF.stream().filter(x -> ).
    }

}
