package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class FrameHandling {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/frames");
		driver = BaseUtility.driver;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		String text =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();  //return to main frame
//		driver.switchTo().parentFrame();     //return to element parent frame
		driver.switchTo().frame(2);         // index 0,1,2,3...
		
		String text2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text2);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		
		WebElement clk = driver.findElement(By.id("sampleHeading"));
		Actions act = new Actions(driver);
		act.contextClick(clk).perform();    // right click on mouse 
		Thread.sleep(2000);
		act.doubleClick(clk).perform(); // double click on mouse  
		
		Thread.sleep(2000);
		driver.close();
	}

}
