package TestNG;
//merge two class of add and multiply and see result in xml file addteono
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multipley {
  @Test
  @Parameters({"a","b"})
  public void multipley(int i,int j) {
	  int product=i*j;
	  System.out.println("multipley two number is="+product);
  }
}
