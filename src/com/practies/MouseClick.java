package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/English/");
		driver.manage().window().maximize();
		
		WebElement manage=driver.findElement(By.xpath(".//*[@id='trips']/a/span[1]"));
		WebElement manageBooking=driver.findElement(By.xpath(".//*[@id='Manage your booking-link-label']"));
	Actions mouse=new Actions(driver);
	mouse.moveToElement(manage).moveToElement(manageBooking).click().build().perform();
	//mouse.moveToElement(manageBooking).click().build().perform();
	
	}

}
