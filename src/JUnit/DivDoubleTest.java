package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class DivDoubleTest extends BaseCalcTest {

    private double expected;

    @Test
    public void testLongDiv() {
        double result = calculator.div(3.0, 2.0);
        expected=3.0/2.0;
        Assert.assertEquals( expected, result, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void checkDivisionByZeroThrowsException()
    {
        calculator.div(3.0,0.0);
    }
}
