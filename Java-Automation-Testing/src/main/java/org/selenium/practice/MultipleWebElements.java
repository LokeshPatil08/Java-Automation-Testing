package org.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.co.in/");
		
		List<WebElement> multi = drive.findElements(By.cssSelector("input[class='gLFyf gsfi']"));
		if(multi.isEmpty()){
			System.out.println("list is empty");
			
		}
	}
//	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).submit();
	
//	WebElement next=driver.findElement(By.cssSelector("_1LKT03"));
//	List<WebElement>moblieName = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
//	Actions actions = new Actions(driver);
//	Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
//	sendEsc.perform();
//	
//	driver.findElement(By.name("q")).sendKeys("iphone 11");
//	driver.findElement(By.className("L0Z3Pu")).click();

}
