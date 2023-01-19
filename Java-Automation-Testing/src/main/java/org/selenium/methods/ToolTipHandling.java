package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ToolTipHandling {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/tool-tips");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		WebElement hovrMe;
		hovrMe=driver.findElement(By.id("toolTipButton"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hovrMe).perform();
		Thread.sleep(2000);
		
		String str ;
		str = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		
		System.out.println(str);
		act.clickAndHold(hovrMe).moveToElement(hovrMe).release().build().perform();
		
		
	}	
//	.isDisplayed();
//	.isEnabled();
//	.isSelected();
}
