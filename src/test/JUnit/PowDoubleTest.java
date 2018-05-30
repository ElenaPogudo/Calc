package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class PowDoubleTest extends BaseCalcTest {

    private double arg1;

    private double arg2;

    private double expected;

    @Test
    public void testDoublePow() {
        double result = calculator.pow(arg1, arg2);
        expected=Math.pow(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 2},
                {0, 1},
                {-1, 1},
                {4, 0.5},
                {2, 0}
        });
    }

}
