package com.example.calculator.model; import com.example.calculator.model.Calculator; import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test; import java.time.LocalDate; public class CalculatorTest {
    Calculator calculator; @BeforeEach public void load(){ calculator = new Calculator();
    }
    @Test void sumTest() { Double result = calculator.sum(1D,2D); assertEquals(3, result);
    }
    @Test public void numbersNullSumTest() { Double result = calculator.sum(1D,2D); assertNotNull(result);
    }
    @Test void subTest() { Double result = calculator.sub(5D,2D); assertEquals(3, result);
    }
    @Test void divideTest() { Double result = calculator.divide(6D,2D); assertEquals(3, result);
    }
    @Test public void divisionByZeroTest() { ArithmeticException runtimeException = assertThrows(ArithmeticException.class, () -> 
        calculator.divide(6D,0D)); assertTrue(runtimeException.getMessage().contains("Divisão por zero não é permitido.")); 
        assertEquals(ArithmeticException.class, runtimeException.getClass());
//        assertThrows()
    }
    @Test void factorialTest() { Integer result = calculator.factorial(10); assertEquals(3628800, result);
    }
    @Test void integerToBinaryTest() { Integer result = calculator.integerToBinary(6); assertEquals(110, result);
    }
    @Test void integerToHexadecimalTest() { String result = calculator.integerToHexadecimal(6); assertEquals("6",result);
    }
    @Test void calculeDayBetweenDateTest() { Integer result = calculator.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), 
                LocalDate.of(2020, 3, 29));
        assertEquals(14 ,result);
    }
}
