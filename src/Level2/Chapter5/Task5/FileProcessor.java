package Level2.Chapter5.Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Level2/Chapter5/Task4/data.txt")))
        {   String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
