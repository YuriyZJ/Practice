package Level2.Chapter6.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortListPerson {

    public Map<Integer, List<Person>> sortList(List<Person> people) {
         return people.stream()
                 .collect(Collectors.groupingBy(Person::getAge));
    }
}
