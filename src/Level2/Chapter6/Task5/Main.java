package Level2.Chapter6.Task5;

import Level2.Chapter6.Task3.SortList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortListPerson sortListPerson = new SortListPerson();
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John", 22));
        listPerson.add(new Person("Jane", 23));
        listPerson.add(new Person("Bob", 21));
        listPerson.add(new Person("Jack", 22));

        System.out.println(sortListPerson.sortList(listPerson));
    }
}
