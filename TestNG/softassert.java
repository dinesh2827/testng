package TestNG;
//soft asser will not skip
//hard asser will skip the condition

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
  @Test
  public void f() {
	  SoftAssert so=new SoftAssert();
	  System.out.println("Started");
	  so.assertEquals(12,12);
	  System.out.println("complete");
	  so.assertAll();
	  
	  
  }
}
