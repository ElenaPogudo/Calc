package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowDoubleTest extends BaseCalcTest {

    private double arg1;

    private double arg2;

    private double expected;

    @Factory(dataProvider = "PowDp")
    public PowDoubleTest(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Test
    public void testDoublePow() {
        double result = calculator.pow(arg1, arg2);
        expected=Math.pow(arg1,arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "PowDp")
    public static Object[][] PowDp() {
        return new Object[][]{
                {2, 2},
                {0, 1},
                {-1, 1},
                {4, 0.5},
                {2, 0}
        };
    }
}
