package Level2.Chapter4.Task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// работает по принципу очереди
public class GenericQueue<T> {
    private final LinkedList<T> list = new LinkedList<>();

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "list=" + list +
                '}';
    }
}
