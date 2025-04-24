package Level2.Chapter4.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterSort {

    public <T> List<T> filter1(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>(list.size());
        for(T t : list){
            if(predicate.test(t)){ //метод test(T t), который возвращает true, если элемент проходит проверку, и false, если нет.
                result.add(t);
            }
        }
        return result;
    }

    public <T> List<T> filter2(List<T> list, Predicate<T> predicate){
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
