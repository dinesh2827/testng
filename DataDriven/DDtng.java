package com.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDtng {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver","D:\\chrome path seleium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://www.amazon.in/");
		FileInputStream f=new FileInputStream("C:\\Users\\Praveen\\OneDrive\\Desktop\\maven project.xls");
		Thread.sleep(2000);
		Workbook w=Workbook.getWorkbook(f);
		Thread.sleep(2000);
		Sheet s=w.getSheet(0);
		Thread.sleep(2000);
		for(int i=0;i<s.getRows();i++)
			
		{
			String prod=s.getCell(0,i).getContents();
			Thread.sleep(2000);
			WebElement g=d.findElement(By.id("twotabsearchtextbox"));
					g.sendKeys(prod);
			Thread.sleep(2000);
			d.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
			d.navigate().back();
			g.clear();
			
			
		}
		d.close();
		
		
	}

}
