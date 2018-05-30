package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class MultDoubleTest extends BaseCalcTest {

    public double arg1;

    public double arg2;

    public double expected;


    @Test
    public void testDoubleMult() {
        double result = calculator.mult(arg1, arg2);
        expected=arg1*arg2;
        Assert.assertEquals(expected, result, 0);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1.2, 1.4},
                {0, 1.5},
                {-1.6, 1.3}
        });
    }

}
