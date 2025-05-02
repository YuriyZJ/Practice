package Level2.Chapter8_Tests.Task2_2;

public interface NotificationService {
    public default void send(String message) {
        System.out.println("Sending: " + message);
    }
}
