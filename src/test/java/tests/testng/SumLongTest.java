package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SumLongTest extends BaseTest{

    @Test(dataProvider = "longValuesForSum", groups = "arithmetic")
    public void sumLongTest(long a, long b, long result){
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sum(a, b) + "]");
        Assert.assertTrue(calculator.sum(a, b) == result);
    }

    @DataProvider(name = "longValuesForSum")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2, 2, 4},
              {5, -10, -5},
              {143, 0, 143}
      };
    }
}
