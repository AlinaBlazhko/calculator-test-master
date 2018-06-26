package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.ITestContext;
import org.testng.annotations.*;

/**
 * Created by X240 on 6/26/2018.
 */
public class BaseTest {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void before(){
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void after(){
        calculator = null;
    }
}
