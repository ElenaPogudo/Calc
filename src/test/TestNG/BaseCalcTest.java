package TestNG;

import com.epam.tat.module4.*;
import org.testng.annotations.*;

public class BaseCalcTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Start method");
    }

    @AfterClass
    public void setDown() {
    System.out.println("End of method");
    }

    @DataProvider(name = "TrigonometryDp")
    public static Object[][] TrigonometryDp() {
        return new Object[][]{
                {2},
                {0},
                {-3.14}
        };
    }
}
