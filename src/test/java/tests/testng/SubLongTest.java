package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class SubLongTest extends BaseTest{
    @Test(dataProvider = "longValuesForSum", groups = "arithmetic")
    public void subLongTest(long a, long b, long result){
        System.out.println("a = [" + a + "], b = [" + b + "], result = [" + calculator.sub(a, b) + "]");
        Assert.assertTrue(calculator.sub(a, b) == result);
    }

    @DataProvider(name = "longValuesForSum")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {2, 2, 0},
              {5, -10, 15},
              {143, 0, 143},
              {-120, -120, 0},
              {-130, -120, -10}
      };
    }
}
