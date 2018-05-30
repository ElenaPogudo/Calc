package JUnit;


import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class IsNegativeTest extends BaseCalcTest {

    private long value;

    private boolean expectedToBeNegative;

    @Test
    public void checkValueNegative() {
        assertEquals(calculator.isNegative(value), expectedToBeNegative);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, false},
                {-1, true},
                {-1000, true},
                {0, false}
        });
    }
}
