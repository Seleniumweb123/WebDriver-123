package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		Actions dragAnddrop=new Actions(driver);
		dragAnddrop.clickAndHold(drag).moveByOffset(80,0).build().perform();
		Thread.sleep(4000);
		dragAnddrop.clickAndHold(drag).moveByOffset(-80,0).build().perform();
		
	}

}
