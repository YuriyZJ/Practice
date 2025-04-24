package Level2.Chapter3.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatWords {

    public Map<String, Integer> repeatedWords1(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        List<String> wordsCopy = new ArrayList<>(); // добавляю проверенные слова в новый лист

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);

            if (wordsCopy.contains(currentWord)) { // для проверки слова проходило ли через цикл
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < words.size(); j++) {
                if (currentWord.equals(words.get(j))) {
                    count++;
                }
            }
            map.put(currentWord, count);
            wordsCopy.add(currentWord);
        }
        return map;
    }

    public Map<String, Integer> repeatedWords2(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String ignoreRegist = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public Map<String, Integer> repeatedWords3(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String ignoreRegist = word.toLowerCase();
            map.merge(ignoreRegist, 1, Integer::sum);
        }
        return map;
    }

    public Map<String, Integer> repeatedWords4(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy( // группирует элементы по ключу (слову) (по параметрам указанные ниже)
                        word -> word, // Функция-классификатор. Возвращает ключ для группировки — само слово
                        Collectors.summingInt (word -> 1))); //Для каждого элемента в группе преобразует его в 1 и суммирует эти значения. (подсчитывает количество элементов в каждой группе)
    }
}
