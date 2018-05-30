package TestNG;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CtgDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Factory(dataProvider = "TrigonometryDp")
    public CtgDoubleTest(double arg1) {
        this.arg1 = arg1;
    }

    @Test(groups = "Tri")
    public void testDoubleCtg() {
        double result = calculator.ctg(arg1);
        expected=(Math.cos(arg1))/(Math.sin(arg1));
        Assert.assertEquals(result, expected);
    }

}
