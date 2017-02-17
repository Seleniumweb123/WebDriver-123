package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActions {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://eci.nic.in/eci/eci.html");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[2]/a/span"));
		WebElement past=driver.findElement(By.xpath(".//*[@id='popmenu1_Elections']/li[2]/a"));
		WebElement assembly=driver.findElement(By.xpath(".//*[@id='popmenu1_Elections']/li[2]/ul/li[5]/a"));
		WebElement  assembly1=driver.findElement(By.xpath(".//*[@id='popmenu1_Elections']/li[2]/ul/li[5]/ul/li[1]/a"));
		Actions chain=new Actions(driver);
		chain.moveToElement(ele).pause(3000).build().perform();
		chain.moveToElement(past).pause(3000).build().perform();
		chain.moveToElement(assembly).pause(3000).build().perform();
		chain.moveToElement(assembly1).click().build().perform();

	}

}
