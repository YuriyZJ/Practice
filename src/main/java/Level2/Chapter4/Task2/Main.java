package Level2.Chapter4.Task2;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair(123, "Adidas");
        Pair<Integer, String> pair2 = new Pair(1, "Nike");
        Pair<Integer, String> pair3 = new Pair(10, "Puma");

        System.out.println("Pair1 when getFirst = " + pair1.getGoods());
        System.out.println("Pair2 when getSecond = " + pair2.getMark());
    }
}
