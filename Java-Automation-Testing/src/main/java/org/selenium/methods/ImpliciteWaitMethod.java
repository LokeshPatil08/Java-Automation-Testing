package org.selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class ImpliciteWaitMethod {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BaseUtility obj = new BaseUtility();
		obj.startup("https://en-gb.facebook.com/");
		driver = BaseUtility.driver;
        
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("lokeshpatil2194@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("loki@008");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
