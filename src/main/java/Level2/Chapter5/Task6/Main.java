package Level2.Chapter5.Task6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MathMethod method = new MathMethod();
        try {
            method.processData();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e.getMessage());
        }
    }
}
