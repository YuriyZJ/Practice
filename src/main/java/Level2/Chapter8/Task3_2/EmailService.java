package Level2.Chapter8.Task3_2;

import java.util.List;

public class EmailService {
    private final EmailSender sender;

    public EmailService(EmailSender sender) {
        this.sender = sender;
    }

    public void sendWelcomeEmails(List<String> emails) {
        for (String email : emails) {
            sender.sendEmail(email, "Welcome", "Hello, new user!");
        }
    }
}
