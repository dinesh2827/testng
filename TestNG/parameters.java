package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
  @Test
  @Parameters({"food"})
  public void f(String j) {
	  System.out.println("favourite food is "+j);
  }
  @Test
  @Parameters({"toy"})
  public void f1(@Optional("no name")String e) {
	  System.out.println("favourite toy is "+e);
  }
  @Test
  @Parameters({"empty"})//didnt give value in xml file
  public void f2(@Optional String t) {//if  we take @Optionalit will give error we define peremeter in xml
	  System.out.println("empty is "+t);
  }
}
