package com.practies;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmWebTable {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		//String date="12/august/2017";
		 String[] dataSplit=date.split("/");
		 String day=dataSplit[0];
		 String month=dataSplit[1];
		 String year=dataSplit[2];
		 FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("DepartDate")).click();
			//year Selection
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
			while (!calYear.equals(year))
			{
				driver.findElement(By.className("nextMonth ")).click();
				calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
			}
			//select month
			
			String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			while (!calmonth.equalsIgnoreCase(month))
			{
				driver.findElement(By.className("nextMonth ")).click();
				calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				
			}
			//day Selection
			List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
			for (int i = 0; i < rows.size(); i++)
			
			{
				List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < col.size(); j++) 
				{
					String calday=col.get(j).getText();
					if (calday.equals(day))
					{
						col.get(j).click();
						break;
					}
				}
			}
			
		 
	}
		

	

}
