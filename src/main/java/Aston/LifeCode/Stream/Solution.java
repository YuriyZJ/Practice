package Aston.LifeCode.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // Из списка List<Integer> получить список только четных чисел.
    public static void filter1(List<Integer> listF){
        listF.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    // Преобразовать List<String> в List<Integer>, содержащий длины строк.
    public static void length2(List<String> listL){
        listL.stream().map(x -> x.length()).forEach(System.out::println);
    }

    // Найти сумму всех элементов в списке List<Integer>.
    public static void sum3(List<Integer> listS){
        int result = listS.stream().reduce(0, Integer::sum);
        System.out.println(result);
    }

    // Из List<String> получить отсортированный список уникальных значений.
    public static void sort4(List<Integer> listS){
        listS.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }

    // Из List<String> найти первое слово, начинающееся на букву "A" (или вернуть null/Optional.empty()).
    public static void findFirstWord5(List<String> listF){
        String result = listF.stream()
                .filter(x -> x.startsWith("a"))
                .findFirst().orElse(null);
        System.out.println(result);
    }

    // Есть список объектов Person(name, age) — получить список имен людей старше 18 лет, отсортированных по возрасту.
    public static void sortAge6(List<Person> listP){
        listP.stream()
                .filter(x -> x.getAge() > 18)
                .sorted(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .forEach(System.out::println);
    }

    // Превратить List<List<String>> приходящий на вход в строку, где каждая строка разделена запятой и пробелом.
    public static void change7(List<List<String>> listCh){
        String result = listCh.stream()
                .flatMap(x -> x.stream())           // flatMap(List::stream) — превращаем список списков в плоский поток строк.
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    //Ваша задача получить список Integer из массива int[]

    //Ваша задача собрать Map из стрима чисел, где ключ это само число, а значение его квадрат. Сборка должна быть в LinkedHashMap

    // Ваша задача взять первые 3 элемента из списка
    public static void findFirstFreeAliment10(List<Integer> listF){
        listF.stream().
                limit(3).
                forEach(System.out::println);
    }

    // Ваша задача сгруппировать пользователей по возрасту
}
