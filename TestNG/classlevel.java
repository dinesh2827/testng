package TestNG;
//run in xml file


import org.testng.annotations.Test;
@Test(groups={"clevel"})
public class classlevel {
	 @Test(groups={"smoke"})
	  public void f() {
		  System.out.println("smoke");
	  }
	  @Test(groups={"smoke","sanity"})
	  public void f1() {
		  System.out.println("null and empty");
	  }
	  @Test(groups={"regerission","sanity"})
	  public void f2() {
		  System.out.println("regerission and sanity");
	  }
	  @Test(groups={"regerission"})
	  public void f3() {
		  System.out.println("null");
	  }
	  @Test(groups={"sanity"})
	  public void f4() {
		  System.out.println("sanity");
	  }
	  
}
