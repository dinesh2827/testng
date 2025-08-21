package baseclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class brmbase extends Brm_base {
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_compname\"]")).sendKeys("infomate");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_cntname\"]")).sendKeys("podadai");
	 
  }
}
