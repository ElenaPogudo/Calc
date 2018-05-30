package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumLongTest extends BaseCalcTest {

    private long arg1;

    private long arg2;

    private long expected;

    @Factory(dataProvider = "sumDp")
    public SumLongTest(long arg1, long arg2, long expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void testLongSum() {
        long result = calculator.sum(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sumDp")
    public static Object[][] sumDp() {
        return new Object[][]{
                {1, 1, 2},
                {0, 1, 1},
                {-1, 1, 0}
        };
    }
}
