package org.selenium.methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class ExplicitWaitMethod {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BaseUtility obj = new BaseUtility();
		obj.startup("https://en-gb.facebook.com/");
//		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(BaseUtility.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" "))); //explicite wait format
		driver = BaseUtility.driver;
        
	}

}
