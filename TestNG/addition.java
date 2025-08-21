package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class addition {
  @Test
  @Parameters({"a","b"})
  public void addtwonumbers(int i,int j) {
	  int sum=i+j;
	  System.out.println("add two numbers ="+sum);
  }
}
