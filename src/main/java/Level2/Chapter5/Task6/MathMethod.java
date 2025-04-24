package Level2.Chapter5.Task6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MathMethod {

    public void processData() throws IllegalArgumentException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Level2/Chapter5/Task6/number.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Math.sqrt(Double.parseDouble(line)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
