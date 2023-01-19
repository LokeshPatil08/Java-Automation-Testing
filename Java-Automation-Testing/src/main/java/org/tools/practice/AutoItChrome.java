package org.tools.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class AutoItChrome {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseUtility start = new BaseUtility();
		start.startup("https://demoqa.com/automation-practice-form");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele= driver.findElement(By.id("uploadPicture"));
//		for scrolling we use this
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(2000);
//		ele.click();  it wont work
//		for click we use this after scrolling
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\software testing\\SCiTE_Storage\\ChromeOpen.exe");
		
		
	}

}
