package Tinkoff;
import java.util.*;
import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        // Решение
        int result = solve(n, x, y, z, a);
        System.out.println(result);
    }

    private static int solve(int n, int x, int y, int z, long[] a) {
        int minOperations = Integer.MAX_VALUE;

        // Для каждого элемента считаем, сколько операций нужно для деления на x, y, z
        for (int i = 0; i < n; i++) {
            int[] ops = new int[3];
            ops[0] = getOperationsCount(a[i], x);
            ops[1] = getOperationsCount(a[i], y);
            ops[2] = getOperationsCount(a[i], z);

            // Проверяем все возможные комбинации использования текущего элемента
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int currentOps = ops[0];
                    if (j != i) currentOps += getOperationsCount(a[j], y);
                    if (k != i && k != j) currentOps += getOperationsCount(a[k], z);
                    if (j == i) currentOps = Math.max(currentOps, ops[1]);
                    if (k == i) currentOps = Math.max(currentOps, ops[2]);
                    if (k == j) currentOps = Math.max(currentOps, getOperationsCount(a[j], z));

                    minOperations = Math.min(minOperations, currentOps);
                }
            }
        }

        return minOperations;
    }

    private static int getOperationsCount(long num, int divisor) {
        if (num % divisor == 0) return 0;
        return (int)((divisor - (num % divisor)));
    }
}