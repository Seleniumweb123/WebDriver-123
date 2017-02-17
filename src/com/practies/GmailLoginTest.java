package com.practies;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		driver.manage().window().maximize();
		FluentWait<WebDriver> fWait=new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		driver.findElement(By.id("Email")).sendKeys("vasu.584");
		driver.findElement(By.id("next")).click();
		fWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
		fWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd"))).sendKeys("Qedge");
	}

}
