package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;


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


}
