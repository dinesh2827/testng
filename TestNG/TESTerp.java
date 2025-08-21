package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TESTerp {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.manage().window().maximize();
  }
  @Test
  public void login () throws InterruptedException, IOException {
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(5000);
	  //hrlink
	  d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[10]/a")).click();
	  //customerid
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_fname\"]")).sendKeys("podadai");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_lname\"]")).sendKeys("v");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_addr\"]")).sendKeys(" cbe ");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_city\"]")).sendKeys("coimbatore");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_state\"]")).sendKeys("tamilnadu");
	  Thread.sleep(5000);
	  //dropdown gender
	  WebElement gender=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_gen\"]"));
	  Select se=new Select(gender);
	  se.selectByIndex(1);
	  //married status
	  WebElement married=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_mst\"]"));
	  Select m=new Select(married);
	  m.selectByIndex(1);
	  Thread.sleep(5000);
	  //dob
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_dob\"]")).sendKeys("28/11/1998");
	  //bloodgroup
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_bg\"]")).sendKeys("A+");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_yexp\"]")).sendKeys("2");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_cname\"]")).sendKeys("Inf0mate");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_jdate\"]")).sendKeys("22/11/2025");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_rdate\"]")).sendKeys("23/12/2025");
	  Thread.sleep(5000);
	 
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_rnum1\"]")).sendKeys("REF12345");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_rnum2\"]")).sendKeys("REF54321");
	  //employe ref
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_empname\"]")).sendKeys("sakthi");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_hdate\"]")).sendKeys("26/07/25");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_djoin\"]")).sendKeys("28/10/2026");
	  Thread.sleep(5000);
	  //drade drop down
	  WebElement grade=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_grade\"]"));
	  Select gr=new Select(grade);
	  gr.selectByIndex(3);
	  //department dropdown
	  WebElement department=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_depart\"]"));
	  Select dp=new Select(department);
	  dp.selectByIndex(2);
	  Thread.sleep(5000);
	  //Designation
	  WebElement Designation=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_des\"]"));
	  Select dc=new Select(Designation);
	  dc.selectByIndex(1);
	  //Employee type
	  WebElement Employeetype=d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_emptype\"]"));
	  Select et=new Select(Employeetype);
	  et.selectByIndex(2);
	  Thread.sleep(5000);
	  //employee type, pay,mail
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_eid\"]")).sendKeys("dxdtgbyhbjku@gmail.com");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_fpay\"]")).sendKeys("55000");
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_shigh\"]")).sendKeys("150000");
	  Thread.sleep(5000);
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Button2\"]")).click();
	  Thread.sleep(5000);
	  //search
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_srch\"]")).sendKeys("EMP001886");
	  //click search
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Button1\"]")).click();
	  //logout
	  d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
	  Thread.sleep(5000);
	  //again login
	  d.findElement(By.id("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.id("Button3")).click();
	  Thread.sleep(5000);
	  //hrlink
	  d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[10]/a")).click();
	  //search
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_srch\"]")).sendKeys("EMP001886");
	  //click search
	  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Button1\"]")).click();
	  Thread.sleep(5000);
	  //screenshot
	  File r=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(r , new File("C:\\Users\\Praveen\\OneDrive\\Desktop\\screenshot\\erp.png"));
		 //logout
		  d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();	  
	  
  }
 
}
