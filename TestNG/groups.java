package TestNG;

import org.testng.annotations.Test;

public class groups {
  @Test(groups={"smoke"})
  public void f() {
	  System.out.println("smoke");
  }
  @Test(groups={"smoke","sanity"})
  public void f1() {
	  System.out.println("smoke and sanity");
  }
  @Test(groups={"regerission","sanity"})
  public void f2() {
	  System.out.println("regerission and sanity");
  }
  @Test(groups={"regerission"})
  public void f3() {
	  System.out.println("regerission");
  }
  @Test(groups={"sanity"})
  public void f4() {
	  System.out.println("sanity");
  }
  
  
  
}
