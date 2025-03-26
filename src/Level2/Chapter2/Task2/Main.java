package Level2.Chapter2.Task2;

public class Main {
    public static void main(String[] args) {
        Revers revers = new Revers();
        int[] array1 = {1,10,5,15,4,9};
        int[] array2 = {100,1,500,11,400,800};
        Integer[] array3 = {1,2,3,4,5,6,7,8,9};

        revers.revers1(array1);
        revers.revers2(array2);
        revers.revers3(array1);
        revers.revers4(array3);
        revers.revers5(array1);
    }
}
