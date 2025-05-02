package Level2.Chapter8_Tests.Task2_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AlertManagerTest {
    @Mock
    NotificationService notificationService;

    @InjectMocks
    AlertManager alertManager;

    @Test
    void shouldCheckMessage_whenSendHigh(){
        alertManager.sendAlert("HIGH");

        verify(notificationService).send("High level alert!");
    }

    @Test
    void shouldCheckMessage_whenSendLow(){
        alertManager.sendAlert("LOW");

        verify(notificationService, never()).send(anyString());
    }
}
