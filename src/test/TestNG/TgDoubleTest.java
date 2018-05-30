package TestNG;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Factory(dataProvider = "TrigonometryDp")
    public TgDoubleTest(double arg1) {
        this.arg1 = arg1;
    }

    @Test(groups = "Tri")
    public void testDoubleTg() {
        double result = calculator.tg(arg1);
        expected=(Math.sin(arg1))/(Math.cos(arg1));
        Assert.assertEquals(result, expected);
    }
}
