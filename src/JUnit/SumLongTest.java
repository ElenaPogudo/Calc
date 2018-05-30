package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class SumLongTest extends BaseCalcTest {

    private long arg1;

    private long arg2;

    private long expected;


    @Test
    public void testLongSum() {
        long result = calculator.sum(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 2},
                {0, 1, 1},
                {-1, 1, 0}
        });
    }
}
