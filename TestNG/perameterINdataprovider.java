package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class perameterINdataprovider {
	WebDriver d;
  @Test(dataProvider ="searchProvider")
  public void testmethod(String author,String searchkey) throws InterruptedException {
	  WebElement searchText=d.findElement(By.name("q"));
	  searchText.sendKeys(searchkey);
	  Thread.sleep(2000);
	  System.out.println("welcome--->"+author+"your search key is--->"+searchkey);
	  Thread.sleep(2000);
	  String testValue =searchText.getAttribute("value");
	  Thread.sleep(2000);
	  searchText.clear();
	  Assert.assertTrue(testValue.equalsIgnoreCase(searchkey));
	  Thread.sleep(2000);	  
  }
  
  @DataProvider(name="searchProvider")
  public Object[][] dp() {
    return new Object[][] {
    	{"sriharshan","los angels"},
    	{"dinesh","portigal"},
    	{"sakthi","velankanni"},
    	{"ERaravith","icland"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.google.com/");
  }

}
