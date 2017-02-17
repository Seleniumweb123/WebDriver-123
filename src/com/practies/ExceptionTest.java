package com.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceptionTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());

	}

}
