package TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class isPositiveTest extends BaseCalcTest {

    private long value;

    private boolean expectedToBePositive;

    @Factory(dataProvider = "valuesDp")
    public isPositiveTest(long value, boolean expectedToBePositive) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
    }

    @Test
    public void checkValuePositive() {
        assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @DataProvider(name = "valuesDp")
    public static Object[][] valuesForCheck() {
        return new Object[][] {
                {1, true},
                {-1, false},
                {-1000, false},
                {0, false}
        };
    }
}
