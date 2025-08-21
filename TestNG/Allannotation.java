package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Allannotation {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
	   d=new ChromeDriver();
		d.get("https://www.nykaa.com/");
		Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  d.close();  
  }

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://crocodile.in/");
		Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  d.close();  
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.vilvahstore.com/");
		Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  d.close(); 
  }

  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.1mg.com/drugs-all-medicines");
		Thread.sleep(2000);
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException {
	  Thread.sleep(2000);
	  d.close();
  }

}
