package JUnit;


import org.junit.Assert;
import org.junit.Test;

public class DivLongTest extends BaseCalcTest {

    private long expected;

    @Test
    public void testLongDiv() {
        long result = calculator.div(3, 2);
        expected=3/2;
        Assert.assertEquals(result, expected);
    }

    @Test(expected = NumberFormatException.class)
    public void checkDivisionByZeroThrowsException()
    {
       calculator.div(3,0);
    }


}
