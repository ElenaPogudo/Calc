package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SqrtDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Factory(dataProvider = "SqrtDp")
    public SqrtDoubleTest(double arg1) {
        this.arg1 = arg1;
    }

    @Test
    public void testDoubleSqrt() {
        double result = calculator.sqrt(arg1);
        expected=Math.sqrt(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "SqrtDp")
    public static Object[][] SqrtDp() {
        return new Object[][]{
                {4},
                {0},
                {0.5},
                {-1}
        };
    }
}
