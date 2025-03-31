package Level2.Chapter4.Task5;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T extends Comparable<T>> {
    private List<T> stack = new ArrayList<>();

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        return stack.removeFirst();
    }

    public T getMax() {
        T max = stack.get(0);
        for (int i = 1; i < stack.size(); i++) {
            if (max.compareTo(stack.get(i)) < 0) {
                max = stack.get(i);
            }
        }
        return max;
    }
}
