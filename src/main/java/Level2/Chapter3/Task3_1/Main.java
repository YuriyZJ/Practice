package Level2.Chapter3.Task3_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Angelina Joli", 40);
        Person person2 = new Person("Margo Robbi", 30);
        Person person3 = new Person("Natally Portman", 48);
        Person person4 = new Person("Britni Spears", 48);
        Person person5 = new Person("Scarlett Johansson", 39);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5);

        //people.sort(new Sort());
        System.out.println(people);

        Sort sort = new Sort();
        sort.compare1(people);
        System.out.println(people);
    }
}
