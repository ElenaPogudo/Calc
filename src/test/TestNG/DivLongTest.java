package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalcTest {

    private long expected;

    @Test
    public void testLongDiv() {
        long result = calculator.div(3, 2);
        expected=3/2;
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void checkDivisionByZeroThrowsException()
    {
       calculator.div(3,0);
    }


}
