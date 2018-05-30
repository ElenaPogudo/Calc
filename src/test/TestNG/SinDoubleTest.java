package TestNG;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SinDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Factory(dataProvider = "TrigonometryDp")
    public SinDoubleTest(double arg1) {
        this.arg1 = arg1;
    }

    @Test(groups = "Tri")
    public void testDoubleSin() {
        double result = calculator.sin(arg1);
        expected=Math.sin(arg1);
        Assert.assertEquals(result, expected);
    }

}
