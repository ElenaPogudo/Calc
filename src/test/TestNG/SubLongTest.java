package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalcTest {

    private long arg1;

    private long arg2;

    private long expected;

    @Factory(dataProvider = "subDp")
    public SubLongTest(long arg1, long arg2, long expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void testLongSub() {
        long result = calculator.sub(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subDp")
    public static Object[][] subDp() {
        return new Object[][]{
                {3, 1, 2},
                {2, 1, 1},
                {-1, 1,-2}
        };
    }
}
