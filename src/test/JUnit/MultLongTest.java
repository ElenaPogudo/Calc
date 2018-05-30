package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class MultLongTest extends BaseCalcTest {

    private long arg1;

    private long arg2;

    private long expected;


    @Test
    public void testLongMult() {
        long result = calculator.mult(arg1, arg2);
        Assert.assertEquals(result, expected);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 1},
                {0, 1, 0},
                {-1, 1,-1}
        });
    }

}
