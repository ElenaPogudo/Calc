package JUnit;

import org.junit.runners.Parameterized;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

public class CosDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;


    @Test
    public void testDoubleCos() {
        double result = calculator.cos(arg1);
        expected=Math.cos(arg1);
        Assert.assertEquals(result, expected);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2},
                {0},
                {-3.14}
        });
    }

}
