package Level2.Chapter2.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;

public class MinMax {

    public void minMax1(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            i++;
        }
        System.out.println("Min1 = " + min + " Max1 = " + max);
    }

    public void minMax2(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num: array){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println("Min2 = " + min + " Max2 = " + max);
    }

    public void minMax3(int[] array){
        Arrays.sort(array);
        System.out.println("Min3 = " + array[0] + " Max3 = " + array[array.length-1]);
    }

    public void minMax4(int[] array){
        IntSummaryStatistics stats = Arrays.stream(array).summaryStatistics();
        System.out.println("Min4 = " + stats.getMin() + " Max4 = " + stats.getMax());
    }

    public void minMax5(Integer[] array){
        int min = Collections.min(Arrays.asList(array));
        int max = Collections.max(Arrays.asList(array));
        System.out.println("Min5 = " + min + " Max5 = " + max);
    }
}
