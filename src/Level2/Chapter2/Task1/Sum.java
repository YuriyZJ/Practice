package Level2.Chapter2.Task1;

import java.util.Arrays;

public class Sum {

    public void sum1(int[] array){
        int i = 0;
        int sum = 0;
        while(i < array.length){
            sum = sum + array[i];
            i++;
        }
        System.out.println("s1 = " + sum);
    }

    public void sum2(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("s2 = " + sum);
    }

    public void sum3(int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        System.out.println("s3 = " + sum);
    }

    public void sum4(int[] array){
        System.out.println("s4 = " + Arrays.stream(array).sum());
    }

    public void sum5(Integer[] array){
        Integer sum = 0;
        for (int num: Arrays.asList(array)){
            sum += num;
        }
        System.out.println("s5 = " + sum);
    }
}
