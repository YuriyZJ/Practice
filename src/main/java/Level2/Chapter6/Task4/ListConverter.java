package Level2.Chapter6.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListConverter {

    public List<Integer> convert1(List<String> list, Function<String, Integer> converter) {
        List<Integer> result = new ArrayList<>();

        list.stream()
                .map(x -> converter.apply(x))
                .forEach(result::add);
        return result;
    }

    public List<Integer> convert2(List<String> list, Function<String, Integer> converter) {
        return list.stream()
                    .map(converter)
                    .collect(Collectors.toList());
    }
}
