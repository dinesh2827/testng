package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Brm_base {
 protected WebDriver d;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		  d.findElement(By.id("txt_pass")).sendKeys("admin");
		  d.findElement(By.id("Button3")).click();
		  Thread.sleep(3000);
  }

}
