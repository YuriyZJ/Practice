package Level2.Chapter3.Task3_1;

import java.util.Comparator;
import java.util.List;

public class Sort implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int compareAge = Integer.compare(p1.getAge(), p2.getAge());

        return compareAge != 0 ? compareAge : p1.getName().compareTo(p2.getName());
    }

    public void compare1(List<Person> list) {
        list.sort(Comparator
                .comparing(Person::getAge)
                .thenComparing(Person::getName));
    }

    /*public int compare2(List<Person> list, Person p1, Person p2) {
        list.sort((p1, p2) ->{
            int compareAge = Integer.compare(p1.getAge(), p2.getAge());
            return compareAge != 0 ? compareAge : p1.getName().compareTo(p2.getName());
        });
    }*/
}
