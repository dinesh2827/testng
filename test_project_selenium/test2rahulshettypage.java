package test_project_selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test2rahulshettypage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver","C:\\chrome path seleium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//radiobutton
		WebElement rd=d.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		rd.click();
		
		
		//autosuggest country
		WebElement f=d.findElement(By.id("autocomplete"));
		f.sendKeys("chi");
		Thread.sleep(3000);
		 List<WebElement> autosuggest = d.findElements(By.xpath("//*[@id=\"ui-id-1\"]"));
		 Thread.sleep(3000);
		 for(WebElement a:autosuggest)
		 {
			 System.out.println("country is:"+a.getText());
			 Thread.sleep(2000);
		 }
		 
		 //dropdown
		 WebElement drop=d.findElement(By.id("dropdown-class-example"));
			Select op2=new Select(drop);
			op2.selectByVisibleText("Option2");
			
			//check box
			WebElement ch=d.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
			ch.click();
			 
			//switch to alart
			d.findElement(By.id("name")).sendKeys("dinesh");
			Thread.sleep(1000);
			WebElement alrt=d.findElement(By.id("alertbtn"));
			alrt.click();
			Thread.sleep(1000);
			Alert a=d.switchTo().alert();
			Thread.sleep(1000);
			System.out.println("alart message is"+a.getText());
			Thread.sleep(1000);
			a.accept();
			Thread.sleep(1000);
			d.findElement(By.id("name")).sendKeys("dinesh");
			Thread.sleep(1000);
			WebElement al=d.findElement(By.id("confirmbtn"));
			Thread.sleep(1000);
			al.click();
			Thread.sleep(1000);
			Alert b=d.switchTo().alert();
			Thread.sleep(1000);
			System.out.println("alart message is"+a.getText());
			Thread.sleep(1000);
			a.accept();
			Thread.sleep(1000);
			
			//webtable error
			 List row=d.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[1]/a"));
			    System.out.println("row size is"+ row.size());
			    List col=d.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/th"));
			    System.out.println("col size is"+ col.size());
			    List cells=d.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td"));
			    System.out.println("cells size is"+cells.size());
			
			    
    //hide and show element display
			    d.findElement(By.id("displayed-text")).sendKeys("alex");
				Thread.sleep(1000);
				WebElement hide=d.findElement(By.id("hide-textbox"));
				Thread.sleep(1000);
				hide.click();
				Thread.sleep(1000);
				WebElement show=d.findElement(By.id("show-textbox"));
				Thread.sleep(1000);
				show.click();
				
	//mouse hover
				WebElement mh=d.findElement(By.id("mousehover"));
				mh.click();
				Actions act=new Actions(d);
				Thread.sleep(2000);
				act.moveToElement(mh).perform();
				Thread.sleep(2000);
				WebElement relode=d.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
				Actions ac=new Actions(d);
				Thread.sleep(2000);
				act.moveToElement(relode).perform();
				Thread.sleep(2000);
		
			
	}

}
