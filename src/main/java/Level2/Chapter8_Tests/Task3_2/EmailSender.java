package Level2.Chapter8_Tests.Task3_2;

public interface EmailSender {
    public default void sendEmail(String to, String subject, String body) {}
}
