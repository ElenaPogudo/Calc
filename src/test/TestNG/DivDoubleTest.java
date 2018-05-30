package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalcTest {

    private double expected;

    @Test
    public void testLongDiv() {
        double result = calculator.div(3.0, 2.0);
        expected=3.0/2.0;
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void checkDivisionByZeroThrowsException()
    {
        calculator.div(3.0,0.0);
    }


}
