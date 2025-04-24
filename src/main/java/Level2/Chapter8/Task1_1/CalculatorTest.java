package Level2.Chapter8.Task1_1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Nested // группируем тесты по методам
    class Add {

        @Test
        void shouldAddPositiveNumber(){
            int result = calculator.add(1,2);
            assertEquals(result,3);
        }

        @Test
        void shouldAddNegativeNumber(){
            int result = calculator.add(-1,-2);
            assertEquals(result,-3);
        }

        @Test
        void shouldAddZeroNumber(){
            int result = calculator.add(0,0);
            assertEquals(result,0);
        }
    }

    @Nested
    class Subtract {

        @Test
        void shouldSubtractPositiveNumber(){
            int result = calculator.subtract(2,1);
            assertEquals(result,1);
        }

        @Test
        void shouldSubtractNegativeNumber(){
            int result = calculator.subtract(-1,-2);
            assertEquals(result, 1);
        }

        @Test
        void shouldSubtractZeroNumber(){
            int result = calculator.subtract(0,1);
            assertEquals(result,-1);
        }
    }
}
