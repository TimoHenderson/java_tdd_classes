import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(6, calculator.add(2,4));
    }
}
