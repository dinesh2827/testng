package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class priorityBase_login {
	 WebDriver d;
  @Test(priority=3)
  public void f() throws InterruptedException {
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys("dinesherp");
	  d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys("313 addtress rs puram");
	  WebElement s=d.findElement(By.id("ContentPlaceHolder1_ddl_state"));
	  s.click();
	  Thread.sleep(3000);
	  Select da=new Select(s);
	  Thread.sleep(3000);
	  da.selectByIndex(5);
	  s.click();
	  Thread.sleep(3000);
	  d.findElement(By.id("ContentPlaceHolder1_txt_city")).sendKeys("cbe");
	  Thread.sleep(3000);
	  
	  
  }
  @Test(priority=2)
  public void valid() throws InterruptedException {
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  d.findElement(By.id("LinkButton1")).click();
	  Thread.sleep(3000);
	 
  }
  @Test(priority=-1)
  public void invalid() throws InterruptedException {
	  d.findElement(By.id("txt_unam")).sendKeys("sylixx");
	  d.findElement(By.id("txt_pass")).sendKeys("adminn");
	  d.findElement(By.id("Button3")).click();
	  Alert al=d.switchTo().alert();
	  Thread.sleep(3000);
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(3000);
	  d.findElement(By.id("LinkButton1")).click();
	  Thread.sleep(3000);
	 
	
  }
  @Test(priority=0)
  public void ilegal() throws InterruptedException {
	  d.findElement(By.id("txt_unam")).sendKeys("@##$$^");
	  d.findElement(By.id("txt_pass")).sendKeys("09876565");
	  d.findElement(By.id("Button3")).click();
	  Alert al=d.switchTo().alert();
	  Thread.sleep(3000);
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(3000);
	  d.findElement(By.id("LinkButton1")).click();
	  Thread.sleep(3000);
	 
	
  }
  @Test(priority=1)
  public void blank() throws InterruptedException {
	  d.findElement(By.id("txt_unam")).sendKeys("");
	  d.findElement(By.id("txt_pass")).sendKeys("");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(3000);
	  Alert al=d.switchTo().alert();
	  Thread.sleep(3000);
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(3000);
	  d.findElement(By.id("LinkButton1")).click();
	  Thread.sleep(3000);
	 
	   }
  
  

  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
  }

  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	  File r=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(r , new File("C:\\Users\\Praveen\\OneDrive\\Desktop\\screenshot\\demo2.png"));
		Thread.sleep(3000);
  }

}

