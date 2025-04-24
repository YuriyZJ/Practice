package Level2.Chapter2.Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Revers {

    //LVL2 (1.1)
    public void revers1 (int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public void revers2 (int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public void revers3 (int[] array){
        IntStream.range(0, array.length)
                .map( i -> array[array.length - 1 - i])
                .forEach(num -> System.out.print(num + ", "));
        System.out.println();
    }

    public void revers4 (Integer[] array){
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
    }

    public void revers5 (int[] array){
        StringBuilder sb = new StringBuilder();
        for (int num : array){
            sb.insert(0, num + ", ");
        }
        System.out.println(sb.toString());
    }
}
