package Level2.Chapter6.Task3;

import java.util.Comparator;
import java.util.List;

public class SortList {

    public void sort (List<String> list) {
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
