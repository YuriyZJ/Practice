package Tinkoff;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'R') {
                System.out.println("Yes");
                return;
            } else if (s.charAt(i) == 'M') {
                System.out.println("No");
                return;
            }
        }
    }
}
