package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterlogin {
	WebDriver d;
  @Test
  @Parameters({"username","password"})
  public void login(String u,String p) {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.findElement(By.id("txt_unam")).sendKeys(u);
		d.findElement(By.id("txt_pass")).sendKeys(p);
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();

  }
}
