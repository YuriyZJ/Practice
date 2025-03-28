package Level2.Chapter3.Task1;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public void addTask(String task){
        queue.add(task);
    }

    public String getNextTask(){
        return queue.poll(); //возвращает и удаляет голову очереди (первый элемент).
    }

    public void isEmpty(){
        for(String task : queue){
            if(task.isEmpty()){
                System.out.println("Ready");
            } else {
                System.out.println("Work nigers");
            }
        }
    }
}
