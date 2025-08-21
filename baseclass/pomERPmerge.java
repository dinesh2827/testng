package baseclass;
//for impoet ctrl+shift+o
//merg cus and sup in pom

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pomERPmerge {
	WebDriver d;
  @Test(priority=1)
  public void cu() throws InterruptedException {
	  pomCostumer cu=new pomCostumer(d);
	  cu.clickcont();
	  cu.entercustname("dinesh");
	  cu.entermail("dihfhgry@gmail.com");
	  Thread.sleep(2000);
			  
  }
  @Test(priority=0)
  public void supplier() throws InterruptedException {
	  supplier su=new supplier(d);
	  su.clickcont();
	  su.entercustname("buddy");
	  su.entermob("90988765356");
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
