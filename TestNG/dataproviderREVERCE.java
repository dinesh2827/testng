package TestNG;
//dev will user for unit testing test also use
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class dataproviderREVERCE { 
  @DataProvider(name="data-provider")
  public Object[][] dpMethod() {
    return new Object[][] {{1,2,3},{5,6,11}};//add 1+2=3 this ia ans sec meth 5+6=11
      
    }
    @Test(dataProvider = "data-provider")
    public void mytest(int a,int b,int result) {
    	int sum = a+b;
    	Assert.assertEquals(result, sum);
  }
}
