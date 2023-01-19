package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class BrowserOperations {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BaseUtility open = new BaseUtility();
		open.startup("https://www.google.com/");
		driver = BaseUtility.driver;
		System.out.println("google is launched");
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoqa.com/tool-tips");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		System.out.println("demoqa is launched");
		Thread.sleep(2000);
		
		driver.navigate().back();  //it will back the page
		System.out.println("back to google");
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("forward to demoqa");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("page is refresh");
		Thread.sleep(2000);
		
	}
}
