package TestNG;

import org.testng.annotations.Test;

public class reguralexpression {
  @Test(groups= {"windows.smoke"})
  public void f1() {
	  System.out.println("windows smoke");
  }
  @Test(groups= {"linux.sanity"})
  public void f2() {
	  System.out.println("linux sanity");
  }
  @Test(groups= {"windows.regerission"})
  public void f3() {
	  System.out.println("windows regerission");
  }
  @Test(groups= {"linux.smoke","linux.regerission"})
  public void f4() {
	  System.out.println("linux smoke linux regerission");
  }
}
