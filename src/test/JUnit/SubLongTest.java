package JUnit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

public class SubLongTest extends BaseCalcTest {

    private long arg1;

    private long arg2;

    private long expected;

    @Test
    public void testLongSub() {
        long result = calculator.sub(arg1, arg2);
        Assert.assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static List<Object[]> isEmptyData() {
        return Arrays.asList(new Object[][] {
                {3, 1, 2},
                {2, 1, 1},
                {-1, 1,-2}
        });
    }
}
