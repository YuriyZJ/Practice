package Level2.Chapter8.Task3_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class EmailServiceTest {

    @Mock
    private EmailSender emailSender;

    @InjectMocks
    private EmailService emailServiceSpy;

    @Test
    void shouldCheckSendEmailEqualsNumberEmailsList() {
        List<String> emails = Arrays.asList("test@gmail.com", "test@gmail.com");
        emailServiceSpy.sendWelcomeEmails(emails);

        verify(emailSender,times(2)).sendEmail(anyString(), eq("Welcome"), eq("Hello, new user!"));
    }

    @Test
    void shouldCheckArgumentsEqualsEmailsList() {
        List<String> emails = Arrays.asList("test1@gmail.com", "test2@gmail.com");
        emailServiceSpy.sendWelcomeEmails(emails);

        for(String email : emails) {
            verify(emailSender).sendEmail(eq(email), eq("Welcome"), eq("Hello, new user!"));
        }
    }

    @Test
    void shouldCheckEmailCallIfListIsEmpty() {
        List<String> emails = Arrays.asList();
        emailServiceSpy.sendWelcomeEmails(emails);

        verifyNoInteractions(emailSender);
    }
}
