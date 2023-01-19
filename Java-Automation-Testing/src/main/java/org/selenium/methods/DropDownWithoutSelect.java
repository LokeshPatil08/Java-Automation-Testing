package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class DropDownWithoutSelect {
	public static WebDriver driver;
	public static void main(String[] args)
	{
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/select-menu");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		driver.findElement(By.xpath("//div[@id='withOptGroup']//input")).sendKeys("Group 1, option 2",Keys.TAB);
		
	}

}
