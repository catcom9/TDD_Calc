
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    void TestAddSuccess(){
        assertEquals(8, calc.add(4, 4));
    }

    @Test
    void TestAddFail(){
        Exception ex =  assertThrows(IllegalArgumentException.class, () -> {calc.add(Integer.MAX_VALUE, 4);});
        assertEquals("Your values are too big", ex.getMessage());
    }

    @Test
    void TestSubSuccess(){
        assertEquals(8, calc.sub(12, 4));
    }

    @Test
    void TestSubFail(){
        Exception ex = assertThrows(IllegalStateException.class, () -> {calc.sub(1, 10);});
        assertEquals("No negative numbers", ex.getMessage());
    }

}
