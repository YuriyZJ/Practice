package Level2.Chapter2.Task4;

public class Main {
    public static void main(String[] args) {
        Spiral spiral = new Spiral();

        int[][] array1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int[][] array2 = {{10, 20, 30},
                         {40, 50, 60},
                         {70, 80, 90}};

        spiral.bypassZigzag1(array1);
        spiral.bypassZigzag2(array2);
        spiral.bypassSpiral(array2);
    }
}
