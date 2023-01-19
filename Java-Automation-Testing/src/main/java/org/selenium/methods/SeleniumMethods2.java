package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class SeleniumMethods2 {
	public static WebDriver driver;
	public static void main(String[] args)
	{
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/radio-button");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		driver.findElement(By.id("yesRadio")).click();;
		WebElement selectAns = driver.findElement(By.cssSelector(".text-success"));
		String text = selectAns.getText();
		System.out.println(text);
	}
}
