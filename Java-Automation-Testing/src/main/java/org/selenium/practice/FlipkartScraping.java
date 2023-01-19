package org.selenium.practice;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class FlipkartScraping {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		BaseUtility openSite = new BaseUtility();
		openSite.startup("https://www.flipkart.com/");
		driver= BaseUtility.driver;
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11"+ Keys.ENTER);
		Thread.sleep(2000);
		
		String str;
		List<WebElement> searchPageResult;
		List<WebElement> searchPriceResult;

//		List<WebElement> nextPage;
//		nextPage = driver.findElements(By.xpath("//span[text()='Next']"));
		List<WebElement> webpage= driver.findElements(By.className("ge-49M")); 
		for(int i = 1; i<=4; i++) {
			driver.findElements(By.className("_1LKTO3"));
			
			
			
			
			if(i>1) {
				str="//a[@class='ge-49M' and text()='"+i+"']";
				driver.findElement(By.xpath(str)).click();
				Thread.sleep(2000);
			}
			searchPageResult = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			searchPriceResult = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			for(int j =0; j<searchPageResult.size();j++){
				System.out.println(searchPageResult.get(j).getText() + searchPriceResult.get(j).getText());
			}
		}
			
	}
}
//List<String> allPhoneText = new ArrayList<>();
//List<String> allPriceText = new ArrayList<>();
//	for(WebElement data : searchPageResult ) {
//		allPhoneText.add(data.getText());
//	}
//	searchPriceResult = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//	for(WebElement price :searchPriceResult) {
//		allPriceText.add(price.getText());
//	}	

//for(String printData : allPhoneText) {
//	System.out.println(printData);
//}
//for(String printPrice :allPriceText ) {
//	System.out.println(printPrice);
//}
