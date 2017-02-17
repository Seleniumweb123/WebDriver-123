package com.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		driver.findElement(By.id("searchBtn")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();// click on ok Button
		//alt.dismiss();  //Click on Close
*/				

	}

}
