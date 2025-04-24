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
    void test(){
        when(repo.findById(1L)).thenReturn(new User("test@example.com")); //Настрой поведение мока

        String result = service.getUserEmail(1L);
        assertEquals(result, "test@example.com");

        verify(repo).findById(1L);
    }
}
