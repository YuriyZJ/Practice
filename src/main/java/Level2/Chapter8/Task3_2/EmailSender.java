package Level2.Chapter8.Task3_2;

public interface EmailSender {
    public default void sendEmail(String to, String subject, String body) {}
}
