package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalcTest {

    public double arg1;

    public double arg2;

    public double expected;

    @Factory(dataProvider = "sumDp")
    public SumDoubleTest(double arg1, double arg2) {
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        @Test
        public void testDoubleSum() {
            double result = calculator.sum(arg1, arg2);
            expected=arg1+arg2;
            Assert.assertEquals(result, expected);
        }

        @DataProvider(name = "sumDp")
        public static Object[][] sumDp() {
            return new Object[][]{
                    {1.2, 1.4},
                    {0, 1.5},
                    {-1.6, 1.3}
            };
        }
    }
