import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before()
    { calculator = new Calculator();

    }

    @Test
    public void addNum() {

        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void subtractNum() {
        assertEquals(4, calculator.subtract(9, 5));
    }

    @Test
    public void multiplyNum() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void divideNum() {
        assertEquals(2, calculator.divide(10, 5), 0.00);
    }


}
