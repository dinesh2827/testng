package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class annotation {
	 WebDriver d;
  @Test
  public void f() throws InterruptedException {
	 
	  WebElement con=d.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select se=new Select(con);
		se.selectByIndex(100);
		Thread.sleep(3000);
		se.selectByVisibleText("Angola");
		se.selectByValue("ETH");
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	 // d.close();
  }

}
