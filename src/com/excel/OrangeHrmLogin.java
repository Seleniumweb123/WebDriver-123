package com.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmLogin {
 public static FirefoxDriver driver;
 
	public static void main(String[] args) 
	{
		String url="http://opensource.demo.orangehrmlive.com/";
		OrangeHrmLogin fun=new OrangeHrmLogin();
		String results=fun.LaunchApp(url);
System.out.println(results);
	}

	public String LaunchApp(String url)
	{
		String res;
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="pass";
		}
		else 
		{
			
		res="fail";	
		}
		return res;
	}
}
