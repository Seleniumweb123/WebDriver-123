package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedbusTest {
	@Test
	public static void autoFill() throws InterruptedException
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
	Thread.sleep(2000);
	List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
	System.out.println(auto.size());
	for (int i = 0; i < auto.size(); i++)
	{
		auto.get(i).getText();
		if (auto.get(i).getText().equals("Hyderabad")) 
		{
			auto.get(i).click();
			break;
		}
	}
		
	}
}
