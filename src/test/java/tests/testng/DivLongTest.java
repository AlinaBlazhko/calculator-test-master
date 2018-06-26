package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by X240 on 6/24/2018.
 */
public class DivLongTest extends BaseTest{

        @Test(dataProvider = "longValuesForDiv", groups = "arithmetic")
    public void sumDoubleTest(long a, long b, long result){
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.div(a, b) + "]");
        Assert.assertTrue(calculator.div(a, b) == result);
    }

    @DataProvider(name = "longValuesForDiv")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2, 0, 0},
              {8, -4, -2},
              {-100, -5, 20},
              {20, 2, 10}
      };
    }
}
