package POM;
//total 3 class 2 selenim noemal class and 1 tstng class and merg 3

//customer+supplier=pomerpmerg


import org.testng.annotations.Test;
import baseclass.supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class customersupplierMERG {
	WebDriver d;
	 @Test(priority=1)
	  public void cu() throws InterruptedException {
		  customer cu=new customer(d);
		  cu.clickcont();
		  cu.entercustname("buddy");
		  cu.entermail("kudehgry@gmail.com");
		  Thread.sleep(2000);
				  
	  }
 @Test(priority=0)
 public void supplier() throws InterruptedException {
	  supplier su=new supplier(d);
	  su.clickcont();
	  su.entercustname("DMbuddy");
	  su.entermob("11988765356");
	  Thread.sleep(2000);
 }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		  d.findElement(By.id("txt_unam")).sendKeys("sylix");
		  d.findElement(By.id("txt_pass")).sendKeys("admin");
		  d.findElement(By.id("Button3")).click();
		  Thread.sleep(2000);
}
  

}
