package baseclass;
//total 3 class 2 selenim noemal class and 1 tstng class and merg 3
//pomcustomer+supplier=pomerpmerg

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomCostumer {
	WebDriver d;
	By cont=By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a");//click link
	By custname=By.xpath("//*[@id=\"ContentPlaceHolder1_txt_compname\"]");
	By mail=By.xpath("//*[@id=\"ContentPlaceHolder1_txt_compemail\"]");
	
public pomCostumer(WebDriver d) {
	this.d=d;
	
}
public void clickcont() {
	d.findElement(cont).click();
}
public void entercustname(String arg) {
	d.findElement(custname).sendKeys(arg);
}
public void entermail(String arg) {
	d.findElement(mail).sendKeys(arg);
}
}
