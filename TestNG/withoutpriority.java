package TestNG;
//whithout priority is ablabetic order

import org.testng.annotations.Test;

public class withoutpriority {
  @Test
  public void f() {
	 System.out.println("bike");
  }
  @Test
  public void t() {
	 System.out.println("laptop");
  }
  @Test
  public void b() {
	 System.out.println("mobile");
  }
  @Test
  public void c() {
	 System.out.println("bags");
  }
}
