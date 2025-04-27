package Level2.Chapter8.Task2_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository repo;

    @InjectMocks
    UserService service;

    @Test
    void shouldReturnUserEmail_whenUserExists(){ //“задано, когда, тогда” (Given-When-Then).
        // given — подготовили моки
        when(repo.findById(1L)).thenReturn(new User("test@example.com")); //Настройка поведение мока

        // when — выполнили действие
        String result = service.getUserEmail(1L);
        assertEquals(result, "test@example.com");

        // then — проверили результат и поведение
        verify(repo).findById(1L);
    }
}
