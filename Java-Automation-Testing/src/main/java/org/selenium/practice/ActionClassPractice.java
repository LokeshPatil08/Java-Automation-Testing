package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ActionClassPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtility start = new BaseUtility();
		start.startup("https://demoqa.com/frames");
		driver= BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

}
