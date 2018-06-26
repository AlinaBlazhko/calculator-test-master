package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by X240 on 6/24/2018.
 */
public class IsPositiveTest extends BaseTest{
    @Test(dataProvider = "valuesForIsPositive", groups = "other")
    public void isPositiveTest(long a, boolean result){
        System.out.println("a = [" + a + "], result = [" + calculator.isPositive(a) + "]");
        Assert.assertTrue(calculator.isPositive(a) == result);
    }

    @DataProvider(name = "valuesForIsPositive")
    public Object[][] valuesForSum(){
      return new Object[][]{
              {-100, false},
              {0, false},
              {40, true}
      };
    }
}
