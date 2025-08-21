package test_project_selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.id("name")).sendKeys("dinesh");
		d.findElement(By.id("email")).sendKeys("dinesh@gmail.com");
		d.findElement(By.id("phone")).sendKeys("9087684320");
		d.findElement(By.id("textarea")).sendKeys("theppakulam 1st street poomarket cbe 1");
		Thread.sleep(2000);
		//radio
		WebElement op1=d.findElement(By.xpath("//*[@id=\"male\"]"));
		op1.click();
		//checkbox
		WebElement ch1=d.findElement(By.xpath("//*[@id=\"wednesday\"]"));
		ch1.click();
		//dropdown
		WebElement dr=d.findElement(By.xpath("//*[@id=\"country\"]"));
		Select con=new Select(dr);
		con.selectByIndex(5);
		//con.selectByVisibleText("india");
		
		// arrow up down scroll
		WebElement arrow=d.findElement(By.xpath("//*[@id=\"colors\"]"));
		for (int i=1;i<=5;i++)
		{
			arrow.sendKeys(Keys.ARROW_UP);
		}
		for (int i=5;i>=1;i--)
		{
			arrow.sendKeys(Keys.ARROW_DOWN);
		}
		
		//slider click
		WebElement click=d.findElement(By.xpath("//*[@id=\"animals\"]"));
		for (int i=1;i<=5;i++)
		{
			click.sendKeys(Keys.ARROW_UP);
		}
		for (int i=5;i>=1;i--)
		{
			click.sendKeys(Keys.ARROW_DOWN);
			
		}
		WebElement click1=d.findElement(By.xpath("//*[@id=\"animals\"]/option[8]"));
		click1.click();
		
		
	/*	//click home
		WebElement home=d.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));
		home.click();
		
		//subscribr click
		
		WebElement sub=d.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a"));
		sub.click();
		d.close();
		
		//file upload
	/*	*/
		d.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).click();
		WebElement up=d.findElement(By.id("singleFileInput"));
		up.sendKeys("C:\\Users\\Praveen\\OneDrive\\Desktop\\TEST CASE - ts -ui.xlsx");
		
		d.findElement(By.xpath("//*[@id=\"multipleFilesForm\"]/button")).click();
		WebElement up2=d.findElement(By.id("multipleFilesInput"));
		up2.sendKeys("C:\\Users\\Praveen\\OneDrive\\Desktop\\TEST CASE - ts -ui.xlsx");
		up2.sendKeys("C:\\Users\\Praveen\\OneDrive\\Documents\\queue and PriorityQueue.docx");
		
		//webtable
		 List row=d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
		    System.out.println("row size is"+ row.size());
		 List col=d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/td"));
		    System.out.println("col size is"+ col.size());
		 List cells=d.findElements(By.xpath("//*[@id=\"HTML1\"]/div/table/tbody/tr/td"));
		    System.out.println("cells size is"+cells.size());
		    
		 //dynamic table
		  
		    List row1=d.findElements(By.xpath(" //*[@id=\"headers\"]/th[3]"));
		    System.out.println("row size is"+ row.size());
		 List col1=d.findElements(By.xpath("//*[@id=\"rows\"]/tr[3]/td[2]"));
		    System.out.println("col size is"+ col.size());
		 List cells1=d.findElements(By.xpath("//*[@id=\"rows\"]/tr[1]/td[1]"));
		    System.out.println("cells size is"+cells.size());
		    
		//Pagination webtable
		 
		    List row3=d.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[1]"));
		    System.out.println("row size is"+ row.size());
		 List col2=d.findElements(By.xpath("//*[@id=\"productTable\"]/thead/tr/th"));
		    System.out.println("col1 size is"+ col.size());
		 List cells2=d.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr/td"));
		    System.out.println("cells1 size is"+cells.size());
		 WebElement c1=d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input"));
        c1.click();
        Thread.sleep(3000);
       	WebElement c2=d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input"));
		c2.click();
		Thread.sleep(3000);
		WebElement c3=d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input"));
		c3.click();	

		//form
		
		d.findElement(By.id("input1")).sendKeys("hai");
		d.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
		d.findElement(By.id("input2")).sendKeys("para2");
		d.findElement(By.xpath("//*[@id=\"btn2\"]")).click();
		d.findElement(By.id("input3")).sendKeys("para ends");
		d.findElement(By.xpath("//*[@id=\"btn3\"]")).click();
		
		//shadow dom
		//d.findElement(By.css("#shadow_host"));
		//JavascriptExecutor js = (JavascriptExecutor) d; 
		//WebElement sd =(WebElement) js.executeScript("return aegument[0].sd", 0);
		
		//WebElement f=d.findElement(By.cssSelector("input[type='checkbox']"));
		//f.click();
		
		
		//wikipedia-search-button	
		
		d.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input")).sendKeys("poco");
		d.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

		//dinamic button
		d.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();
		
		//popalart
		WebElement a1=d.findElement(By.id("alertBtn"));
		a1.click();
		Alert a=d.switchTo().alert();
		System.out.println("alart message is"+a.getText());
		a.accept();
		WebElement a2=d.findElement(By.id("confirmBtn"));
		a2.click();
		Alert b=d.switchTo().alert();
		System.out.println("alart message is"+b.getText());
		b.accept();
		WebElement a3=d.findElement(By.id("promptBtn"));
		a3.click();
		Alert c=d.switchTo().alert();
		System.out.println("alart message is"+c.getText());
		c.accept();
		WebElement a4=d.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));//newtab
		a4.click();
		
		//WebElement a5=d.findElement(By.xpath("//*[@id=\"PopUp\"]"));
		//a5.click();
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab1 =new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab1.get(1));
		d.get("https://www.selenium.dev/");
		d.close();
		ArrayList<String> tab1r=new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab1r.get(0));
		d.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		
		//mousehover
		WebElement pointme=d.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		WebElement mouse=d.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[1]"));
		WebElement laptop=d.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[2]"));
		Actions act=new Actions(d);
		Thread.sleep(2000);
		act.moveToElement(pointme).perform();
		Thread.sleep(2000);
		act.moveToElement(mouse).perform();
		
		act.moveToElement(laptop).perform();
		
		//doubleclick
		WebElement dc=d.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions doublec=new Actions(d);
		doublec.doubleClick(dc).perform();
		
		//drag and drop
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions ac=new Actions(d);
		Thread.sleep(3000);
		ac.dragAndDrop(drag,drop).build().perform();
		
		//slider
		WebElement slider=d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		for(int i=1;i<=90;i++)
		{
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		for (int i=90;i>=20;i--)
		{
			slider.sendKeys(Keys.ARROW_LEFT);
		}
		WebElement slider1=d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		for(int i=1;i<=100;i++)
		{
			slider1.sendKeys(Keys.ARROW_RIGHT);
		}
		
		for (int i=100;i>=10;i--)
		{
			slider1.sendKeys(Keys.ARROW_LEFT);
		}
		
	//scrolling dropdown
		
	//labe and link
		d.get("https://testautomationpractice.blogspot.com/");
		d.get("https://www.apple.com/");
		d.navigate().refresh();	
		d.get("https://www.lenovo.com/in/en//");
		d.get("https://www.dell.com/en-in");
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().forward();
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		
		//brokenlink
		d.get("http://www.deadlinkcity.com/error-page.asp?e=400");
		d.navigate().refresh();	
		d.get("http://www.deadlinkcity.com/error-page.asp?e=401");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=403");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=404");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=408");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=500");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=502");
		d.get("http://www.deadlinkcity.com/error-page.asp?e=503");
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().forward();
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		d.navigate().back();
		d.navigate().back();
		d.navigate().back();
		d.navigate().back();
		d.navigate().back();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

		


		
		
		
		
		


		
		    

		 
		 

		    
		
		
		
		
		
		
		
}
}
