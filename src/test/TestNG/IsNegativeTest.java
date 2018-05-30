package TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IsNegativeTest extends BaseCalcTest {

    private long value;

    private boolean expectedToBeNegative;

    @Factory(dataProvider = "valuesDp")
    public IsNegativeTest(long value, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test
    public void checkValueNegative() {
        assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

    @DataProvider(name = "valuesDp")
    public static Object[][] valuesForCheck() {
        return new Object[][] {
                {1, false},
                {-1, true},
                {-1000, true},
                {0, false}
        };
    }
}
