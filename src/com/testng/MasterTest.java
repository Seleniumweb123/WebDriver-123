package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MasterTest {
public static FirefoxDriver driver;
@BeforeSuite
public static void appLaunch()
{
	 driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
}
@BeforeTest
public static void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	if (driver.findElement(By.id("welcome")).isDisplayed()) 
	{
		System.out.println("AdminLogin Successfully");
	}else
	{
		System.out.println("AdminLogin Fail");
	}
}
@AfterTest
public static void appLogout()
{
	System.out.println("AppLogout");
}
@AfterSuite
public static void appclose(){
	System.out.println("appclose");
}
}


