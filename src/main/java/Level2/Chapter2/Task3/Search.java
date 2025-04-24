package Level2.Chapter2.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.EnumSet.range;

public class Search {
    public int[] searchNumb1(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public List<int[]> searchNumb2 (int[][] matrix, int number) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result.isEmpty() ? List.of( new int[] {-1, -1}) : result;
    }

    public int[] searchNumb3(int[][] matrix, int number) {
        return IntStream.range(0, matrix.length) // 1. Создаём поток индексов строк матрицы (от 0 до matrix.length - 1)
                .boxed() // 2. Преобразуем IntStream в Stream<Integer> (нужно для flatMap)
                .flatMap(i -> IntStream.range(0, matrix[0].length) // 3. Для каждой строки (i) создаём поток индексов её столбцов (j)
                        .filter(j -> matrix[i][j] == number) // 4. Оставляем только те столбцы (j), где matrix[i][j] == number
                        .peek(j -> System.out.println("Найдено в [" + i + "][" + j + "]"))
                        .mapToObj(j -> new int[]{i, j}))  // 5. Преобразуем найденные j в массив [i, j] (координаты)
                .findFirst() // 6. Берём первый найденный элемент (если есть)
                .orElseGet(() -> {  // 7. Если ничего не найдено, возвращаем [-1, -1]
                    System.out.println("Число не найдено");
                    return new int[]{-1, -1};
                });
    }
}
