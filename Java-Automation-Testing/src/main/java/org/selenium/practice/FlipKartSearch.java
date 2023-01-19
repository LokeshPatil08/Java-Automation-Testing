package org.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class FlipKartSearch 
{
	public void printData() throws Exception
	{
		List<WebElement> searchPageResult;
		List<WebElement> searchPriceResult;
		
		Thread.sleep(2000);
		searchPageResult = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		searchPriceResult = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i =0; i<searchPageResult.size();i++)
		{
			System.out.println(searchPageResult.get(i).getText() + searchPriceResult.get(i).getText());
		}
	}	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception
	{
		BaseUtility openSite = new BaseUtility();
		openSite.startup("https://www.flipkart.com/");
		driver= BaseUtility.driver;
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11"+ Keys.ENTER);
		Thread.sleep(2000);
		
		FlipKartSearch obj = new FlipKartSearch();
		
		List<WebElement> nextPage = driver.findElements(By.xpath("//span[text()='Next']"));
		System.out.println(nextPage.isEmpty());
		while(!nextPage.isEmpty())
		{
			if(nextPage.get(0).isDisplayed()) 
			{
				nextPage.get(0).click();
				Thread.sleep(5000);
				obj.printData();
				nextPage = obj.driver.findElements(By.xpath("//span[text()='Next']"));
			}
		}
		driver.close();
	}

}
