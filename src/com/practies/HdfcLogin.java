package com.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcLogin {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		String homePage=driver.getWindowHandle();
		System.out.println(homePage);
		driver.findElement(By.id("loginsubmit")).click();
		Set windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		while(iterator.hasNext())
		{
			String currentwindowid=iterator.next().toString();
			if (!homePage.equals(currentwindowid)) 
			{
				driver.switchTo().window(currentwindowid);
				driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).click();
			}
		}

	}

}
