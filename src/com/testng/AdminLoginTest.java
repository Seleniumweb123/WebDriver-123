package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
	//Public variable
	 static FirefoxDriver driver;
	 static String exp,act;
	 
@BeforeTest
public static void appLaunch()
{
	 driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
}
@Test
public static void appLogin()
{
	exp="Welcome Admin";
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElementById("btnLogin").click();
	//act=driver.findElement(By.id("welcome")).getText();
	//driver.findElementById("btnLogin").click();
	//Assert.assertEquals(act,exp,"Login Fail");
}


}
