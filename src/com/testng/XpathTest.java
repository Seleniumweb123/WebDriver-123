package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XpathTest
{
@Test
public static void xpath()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://yahoo.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
	List<WebElement> links=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_3_148666')]/a"));
	System.out.println(links.size());
	links.get(0).click();
	
}
}
