package Tinkoff;

import java.util.*;

public class Task6 {
    static class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(scanner.nextLong(), scanner.nextLong());
        }

        System.out.println(solve(n, points));
    }

    private static boolean isCollinear(Point p1, Point p2, Point p3) {
        // Проверяем, лежат ли три точки на одной прямой
        return (p2.y - p1.y) * (p3.x - p2.x) == (p3.y - p2.y) * (p2.x - p1.x);
    }

    private static int solve(int n, Point[] points) {
        if (n < 3) return 0;

        int maxTriples = 0;
        boolean[] used = new boolean[n];

        // Перебираем все возможные тройки точек
        for (int i = 0; i < n - 2; i++) {
            if (used[i]) continue;

            for (int j = i + 1; j < n - 1; j++) {
                if (used[j]) continue;

                for (int k = j + 1; k < n; k++) {
                    if (used[k]) continue;

                    // Проверяем, образуют ли точки невырожденный треугольник
                    if (!isCollinear(points[i], points[j], points[k])) {
                        used[i] = used[j] = used[k] = true;
                        maxTriples++;
                        break;
                    }
                }

                if (used[j]) break;
            }
        }
        return maxTriples;
    }
}
