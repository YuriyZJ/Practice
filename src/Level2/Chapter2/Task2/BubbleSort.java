package Level2.Chapter2.Task2;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort1(int[] array) {
        boolean swapped = false;

        while (!swapped) {
            swapped = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapped = false;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(array));
    }

    public void bubbleSort2(int[] array) {
        for (int j = 0; j < array.length - 1; j++){
            for (int i = 0; i < array.length - 1 - j; i++) { //С каждым проходом j правая граница уменьшается, так как самые большие элементы уже "всплыли" в конец и их не нужно трогать.
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(array));
    }

    // Шейкерная сортировка
    public void bubbleSort3(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        }
        System.out.println("Sorted (step " + left + ") array is: " + Arrays.toString(array));
    }
}
