package Level1.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToFilter {
    List<String> list = new ArrayList<>(Arrays.asList ("apple", "banana", "cherry", "date", "fig"));

    public List<String> filterWords() {
        List<String> result = new ArrayList<>();{
            for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
                if (word.length() > 5) {
                    result.add(word);
                    System.out.println(word);
                }
            }
        }
        return result;
    }
}
