package Level2.Chapter3.Task3_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConnectIndex {

    public Map<String, Set<Integer>> connectIndex(Map<Integer, String> documents) {
        Map<String, Set<Integer>> index = new HashMap<>();

        for (Map.Entry<Integer, String> entry : documents.entrySet()) {
            int id = entry.getKey();
            String document = entry.getValue();

            String[] words = document.toLowerCase().split(" ");

            for (String word : words) {

                index
                        .computeIfAbsent(word, k -> new HashSet<>()) //Если слово отсутствует в индексе, создает для него новый HashSet.
                        .add(id); //Добавляет ID документа в множество.
            }
        }
        return index;
    }
}
