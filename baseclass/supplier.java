package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class supplier {
	WebDriver d;
	By sup=By.xpath("//*[@id=\"hmenu\"]/ul/li[4]/a");//click supplier link
	By supname=By.xpath("//*[@id=\"ContentPlaceHolder1_txt_cntname\"]");
	By supmob=By.xpath("//*[@id=\"ContentPlaceHolder1_txt_mbl\"]");
	
public supplier(WebDriver d) {
	this.d=d;
	
}
public void clickcont() {
	d.findElement(sup).click();
}
public void entercustname(String arg) {
	d.findElement(supname).sendKeys(arg);
}
public void entermob(String arg) {
	d.findElement(supmob).sendKeys(arg);
}


}
