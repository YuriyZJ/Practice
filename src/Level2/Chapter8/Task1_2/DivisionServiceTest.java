package Level2.Chapter8.Task1_2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DivisionServiceTest {

    @Nested
    class Divide {
        DivisionService divisionService = new DivisionService();

        @Test
        void shouldThrowExceptionWhenDivisionIsNull() {

            assertThrows(IllegalArgumentException.class, () -> {
                divisionService.divide(2, 0);
            });
        }

        @Test
        void shouldDividePositiveNumbers(){
            int result = divisionService.divide(2, 2);
            assertEquals(result, 1);
        }

        @Test
        void shouldThrowExceptionWhenDivisionIsNull2() {

            assertThrows(IllegalArgumentException.class, new org.junit.jupiter.api.function.Executable() {
                @Override
                public void execute() throws Throwable{
                    divisionService.divide(20, 0);
                }
            });
        }
    }
}
