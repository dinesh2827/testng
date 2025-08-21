package TestNG;

import org.testng.annotations.Test;

public class priority {
  @Test (priority=2)
  public void f() {
	  System.out.println("red");
  }
  @Test (priority=-2)
  public void d() {
	  System.out.println("green");
  }
  @Test (priority=0)
  public void m() {
	  System.out.println("pink");
  }
  @Test (priority=1)
  public void o() {
	  System.out.println("orange");
  }
  @Test
  public void k() {
	  System.out.println("yellow");
  }
}
