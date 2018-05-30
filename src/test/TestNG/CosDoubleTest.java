package TestNG;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Factory(dataProvider = "TrigonometryDp")
    public CosDoubleTest(double arg1) {
        this.arg1 = arg1;
    }

    @Test(groups = "Tri")
    public void testDoubleCos() {
        double result = calculator.cos(arg1);
        expected=Math.cos(arg1);
        Assert.assertEquals(result, expected);
    }

}
