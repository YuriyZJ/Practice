package Tinkoff;
import java.util.Scanner;
//----
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = scanner.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(calculateTotalCuts(n, s, a));
    }

    public static long calculateTotalCuts(int n, long s, int[] a) {
        long totalCuts = 0;

        for (int l = 0; l < n; l++) {
            long sum = 0;
            for (int r = l; r < n; r++) {
                sum += a[r];
                totalCuts += (sum + s - 1) / s - 1;  // Количество разрезов на отрезке [l, r]
            }
        }

        return totalCuts;
    }
}