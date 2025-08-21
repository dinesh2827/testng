package TestNG;

import org.testng.annotations.Test;

public class metaGroup {
  @Test(groups= {"cucumber"})
  public void f() {
	  System.out.println("in cucumber");
  }
  @Test(groups= {"apple"})
  public void f1() {
	  System.out.println("in apple");
  }
  @Test(groups= {"banana"})
  public void f2() {
	  System.out.println("in banana");
  }
  @Test(groups= {"carrot"})
  public void f3() {
	  System.out.println("in carrot");
  }
  @Test(groups= {"brinjol"})
  public void f4() {
	  System.out.println("in brinjol");
  }
}
