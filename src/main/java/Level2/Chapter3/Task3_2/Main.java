package Level2.Chapter3.Task3_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> documents = new HashMap<>();
        documents.put(1, "Passport");
        documents.put(2, "Driver license");
        documents.put(3, "Student license");
        documents.put(4, "Developer license");

        ConnectIndex list = new ConnectIndex();
        System.out.println(list.connectIndex(documents));

    }
}
