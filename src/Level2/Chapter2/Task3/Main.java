package Level2.Chapter2.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int[][] test2 = {{10, 20, 30},
                        {4, 5, 6},
                        {700, 800, 900}};

        //LVL3 (1.1)
        Transposition transposition = new Transposition();

        transposition.transpose1(test1);
        transposition.transpose2(test1);
        transposition.transpose3(test2);

        //LVL3 (1.2)
        Search search = new Search();

        System.out.println(Arrays.toString(search.searchNumb1(test1, 5)));
        System.out.println(search.searchNumb2(test1, 5));
        System.out.println(Arrays.toString(search.searchNumb3(test1, 5)));
    }
}
