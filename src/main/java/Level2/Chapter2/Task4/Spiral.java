package Level2.Chapter2.Task4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Spiral {

    public void bypassZigzag1 (int[][] matrix ) {
        for (int i = 0; i < matrix.length; i++){
            if ( i % 2 == 0){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public void bypassZigzag2 (int[][] matrix) {
        int[][] newArray = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            if ( i % 2 == 0){
                for (int j = 0; j < matrix[i].length; j++){
                    newArray[i][j] = matrix[i][j];
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--){
                    newArray[i][j] = matrix[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(newArray));
    }

    public void bypassSpiral(int[][] matrix) {
        if (matrix.length == 0) return;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Верхняя строка (слева направо)
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // Правый столбец (сверху вниз)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                // Нижняя строка (справа налево)
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                // Левый столбец (снизу вверх)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
