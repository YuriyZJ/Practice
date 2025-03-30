package Level2.Chapter4.Task1;

import java.util.List;

public class Find {

    public <T extends Comparable<T>> T findMax1(List<T> list){
        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public <T extends Comparable<T>> T findMax2(List<T> list){
        return list.stream()
                .max(Comparable::compareTo)
                .orElseThrow(null);
    }
}
