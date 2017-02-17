package com.excel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class orangehrmmaster 
{
	String url="http://opensource.demo.orangehrmlive.com";
	static WebDriver driver;
	String username="Admin";
    String pword="admin";
    String res,expname,actname,ename;
    String fsname="vennala23445";
	 String lsname="somarouthu";
	 
	public String LaunchApp(String url)
	{
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
	public String login()

	{
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed())
      {
			res="pass";	
			
		}
		else 
		{
			
		res="fail";	
		}
		return res;
		
		
	}
	public String Logout()
	{
		
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.partialLinkText("Welcome")).click();
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.linkText("Logout")).click();
		Sleeper.sleepTightInSeconds(10);
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
	public String Close() 
	{
		driver.quit();
		Sleeper.sleepTightInSeconds(5);
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="fail";
		}
		else 
		{
			
		res="pass";	
		}
		return res;
		
	}             
	public String empreg()
	{
	
		Sleeper.sleepTightInSeconds(20);
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(20);
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("firstName")).sendKeys(fsname);
		driver.findElement(By.id("lastName")).sendKeys(lsname);
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("btnSave")).click();
	    if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
	    {
	    	res="pass";
		}
		else 
		{
			
		res="fail";	
		}
		return res;
		
		
	}
	public void userreg()
	{
		ename="karthik234";
		driver.findElement(By.linkText("Admin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("vennala23445 somarouthu");
		driver.findElement(By.id("systemUser_userName")).sendKeys("karthik456");
		driver.findElement(By.id("systemUser_password")).sendKeys("shirisha123");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("shirisha123");
		driver.findElement(By.id("btnSave")).click();
		Sleeper.sleepTightInSeconds(10);
		List<WebElement> userlist=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td/a"));
		
		System.out.println(userlist.size());
		for (int i = 1; i < userlist.size(); i++)
		{

			if (userlist.get(i).getText().equals(ename)) {
				
				System.out.println(userlist.get(i).getText());
				System.out.println("pass");
				break;
			}
			
		}
		
	}

}
