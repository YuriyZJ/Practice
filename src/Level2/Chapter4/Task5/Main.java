package Level2.Chapter4.Task5;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());

        System.out.println(stack.getMax());
    }
}
