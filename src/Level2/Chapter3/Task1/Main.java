package Level2.Chapter3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //LVL1 (1.1)
        Transformation transformation = new Transformation();
        List<String> text = new ArrayList<>();
        text.add("текст ! Напишите метод который принимает List<String> содержащий текст и возвращает Set<String> со всеми уникальными словами без учета регистра");

        System.out.println(transformation.transform1(text));
        System.out.println(transformation.transform2(text));
        System.out.println(transformation.transform3(text));
        System.out.println(transformation.transform4(text));
        System.out.println();

        //LVL1 (1.2)
        TaskQueue taskQueue = new TaskQueue();

        taskQueue.addTask("Task1 - Buy BTC");
        taskQueue.addTask("Task2 - Dishes");
        taskQueue.addTask("Task3 - Go to the shop");

        System.out.println(taskQueue.getNextTask());
        System.out.println(taskQueue.getNextTask());
        taskQueue.isEmpty();
    }
}
