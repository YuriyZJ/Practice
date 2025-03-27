package Tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if (n == 3) {
            int target = Math.max(a[0], Math.min(a[2], a[1]));
            System.out.println(Math.abs(a[2] - target));
            return;
        }

        int a1 = a[0];
        int a2 = a[1];
        int[] rest = new int[n - 2];
        System.arraycopy(a, 2, rest, 0, n - 2);
        Arrays.sort(rest);

        int minChanges = Integer.MAX_VALUE;

        for (int i = 0; i <= rest.length - m; i++) {
            int low = rest[i];
            int high = rest[i + m - 1];

            // Определяем целевые границы
            int targetLow = Math.max(a1, low);
            int targetHigh = Math.min(a2, high);

            if (targetLow <= targetHigh) {
                int changes = 0;
                // Корректируем выбранные m дней
                for (int j = i; j < i + m; j++) {
                    if (rest[j] < a1) changes += a1 - rest[j];
                    else if (rest[j] > a2) changes += rest[j] - a2;
                }
                // Корректируем остальные дни
                for (int j = 0; j < i; j++) {
                    changes += Math.abs(rest[j] - a1);
                }
                for (int j = i + m; j < rest.length; j++) {
                    changes += Math.abs(rest[j] - a2);
                }
                minChanges = Math.min(minChanges, changes);
            }
        }

        int changesA1A2 = 0;
        int goodDays = 0;
        for (int i = 2; i < n; i++) {
            if (a[i] >= a[0] && a[i] <= a[1]) goodDays++;
        }
        if (goodDays >= m) {
            minChanges = Math.min(minChanges, 0);
        }

        System.out.println(minChanges == Integer.MAX_VALUE ? 0 : minChanges);
        scanner.close();
    }
}