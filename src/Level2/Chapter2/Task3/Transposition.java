package Level2.Chapter2.Task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Transposition {

    public void transpose1(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] matrixNew = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixNew[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transposed matrix1" + Arrays.deepToString(matrixNew));
    }

    public void transpose2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Transposed matrix2" + Arrays.deepToString(matrix));
    }

    public int[][] transpose3(int[][] matrix) {
        return IntStream.range(0, matrix[0].length) //Создаёт поток индексов столбцов новой матрицы (от 0 до количество столбцов исходной матрицы - 1).
                .mapToObj(j -> IntStream.range(0, matrix.length) //Для каждого индекса j (столбец новой матрицы) создаёт объект (здесь — массив int[]). Для каждого j создаёт поток индексов строк исходной матрицы (от 0 до количество строк - 1).
                        .map(i -> matrix[i][j]) //Для каждого индекса i (строка исходной матрицы) берёт элемент matrix[i][j]. Таким образом, собирает все элементы столбца j исходной матрицы.
                        .toArray()) //Преобразует поток IntStream в массив int[] (один столбец исходной матрицы → строка новой матрицы).
                .peek(row -> System.out.println(Arrays.toString(row))) // Вывод каждой строки
                .toArray(int[][]::new); // Финализация стрима (без сохранения результата). Собирает все сформированные строки (бывшие столбцы) в новую матрицу int[][].
    }
}
