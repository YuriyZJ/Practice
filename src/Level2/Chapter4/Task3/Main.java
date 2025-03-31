package Level2.Chapter4.Task3;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.isEmpty());
    }
}
