package Level2.Chapter3.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class Transformation {

    //Все реализации Set в Java (HashSet, TreeSet, LinkedHashSet) следуют правилу: "один элемент — один экземпляр".

    public Set<String> transform1(List<String> phrase) {
        Set<String> set = new HashSet<>();
        for (String text : phrase) {
            String[] words = text.split(" ");
            for (String word : words) {
                set.add(word.toLowerCase());
            }
        }
        return set;
    }

    public Set<String> transform2(List<String> phrase) {
        Set<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); //автоматически сортирует слова
        for (String text: phrase) {
            Collections.addAll(set, text.split(" "));
        }
        return set;
    }

    public Set<String> transform3(List<String> phrase) {
        return phrase.stream()
                .flatMap(word -> Arrays.stream(word.split(" "))) // разбиваем строку на слова
                .map(String::toLowerCase) // приводит к нижнему регистру
                .collect(Collectors.toSet()); // собираем в Set
    }

    public Set<String> transform4(List<String> phrase) {
        Set<String> set = new TreeSet<>();
        for (String text : phrase) {
            String[] words = text.split(" ");
            for (String word : words) {
                String cleaned = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
                if (!cleaned.isEmpty()) {
                    set.add(cleaned);
                }
            }
        }
        return set;
    }
}
