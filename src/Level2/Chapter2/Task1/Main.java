package Level2.Chapter2.Task1;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        Integer[] array2 = {1,2,3,4};
        Sum s1 = new Sum();

        //LVL1 (1.1)
        s1.sum1(array1);
        s1.sum2(array1);
        s1.sum3(array1);
        s1.sum4(array1);
        s1.sum5(array2);

        //LVL1 (1.2)
        MinMax mm = new MinMax();
        mm.minMax1(array1);
        mm.minMax2(array1);
        mm.minMax3(array1);
        mm.minMax4(array1);
        mm.minMax5(array2);
    }
}
