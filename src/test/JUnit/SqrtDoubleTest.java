package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class SqrtDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Test
    public void testDoubleSqrt() {
        double result = calculator.sqrt(arg1);
        expected=Math.sqrt(arg1);
        Assert.assertEquals(expected, result, 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {4},
                {0},
                {0.5},
                {-1}
        });
    }

}
