package JUnit;

import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SumDoubleTest extends BaseCalcTest {

    public double arg1;

    public double arg2;

    public double expected;

        @Test
        public void testDoubleSum() {
            double result = calculator.sum(arg1, arg2);
            expected=arg1+arg2;
            Assert.assertEquals(expected, result, 0);
        }

    @Parameterized.Parameters
    public static List<Object[]> isEmptyData() {
        return Arrays.asList(new Object[][] {
                { 2, 2},
                { 0, 5 },
                { -3, 5 },
        });
    }
    }
