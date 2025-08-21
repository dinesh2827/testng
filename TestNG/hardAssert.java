package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
  @Test
  public void f() {
	  System.out.println("Started");
	  Assert.assertEquals("fruit", "fruit","values are not equals");
	  System.out.println("completed");
  }
  @Test
  public void f1() {
	  System.out.println("Started");
	  Assert.assertNotEquals("fruit", "Fruit","values are not equals");
	  System.out.println("completed");
}
  @Test
  public void f2() {
	  System.out.println("Started");
	  Assert.assertNotEquals("fruit", "Fruit","values are not equals");
	  System.out.println("completed");
}
  @Test
  public void f3() {
	  System.out.println("Started");
	  String b=new String("jellyfish");
	  Assert.assertTrue(b.contains("ish"));
	  System.out.println("completed");
}
  
  
  
  
}
