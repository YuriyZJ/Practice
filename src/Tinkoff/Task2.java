package Tinkoff;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            if (a < 7) {
                System.out.println(-1);
                continue;
            }
            long k = 63 - Long.numberOfLeadingZeros(a);
            long remaining = a;
            int count = 0;
            long sum = 0;
            for (long bit = k; bit >= 0 && count < 3; bit--) {
                long power = 1L << bit;
                if (power <= remaining) {
                    sum += power;
                    remaining -= power;
                    count++;
                }
            }
            System.out.println(count == 3 ? sum : -1);
        }
    }
}