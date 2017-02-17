package com.practies;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class DownloadFile {

	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Seleniumhq.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Robot download=new Robot();
		download.keyPress(java.awt.event.KeyEvent.VK_TAB);
		Thread.sleep(3000);
		download.keyPress(java.awt.event.KeyEvent.VK_ENTER);

	}

}
