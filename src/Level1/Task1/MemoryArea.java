package Level1.Task1;

import java.util.Scanner;

public class MemoryArea {
    public static void main(String[] args) {
        int x = 10;  // x хранится в стеке
        String text = "Hello";  // text – ссылка в стеке, объект "Hello" в куче
        MemoryArea obj = new MemoryArea(); // obj – ссылка в стеке, сам объект в куче

        System.identityHashCode(obj);
        System.out.println(System.identityHashCode(obj)); //проверяет идентификатор объектов в памяти

        Scanner scanner = new Scanner(System.in);
        System.out.println(System.identityHashCode(scanner));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(System.identityHashCode(scanner1));
    }
}
