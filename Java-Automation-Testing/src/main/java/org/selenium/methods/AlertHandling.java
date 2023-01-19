package org.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class AlertHandling {
	public static WebDriver driver;
	public void alert() throws InterruptedException {
		BaseUtility start = new BaseUtility();
		start.startup("https://demoqa.com/alerts");
		driver=BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		
		
//	    Alert class is there use this format to switch on alert
		Alert a = driver.switchTo().alert();  
		System.out.println(a.getText());
		
		Thread.sleep(2000);
		a.sendKeys("Lokesh patil");
		Thread.sleep(2000);
		a.accept();
//		a.dismiss();
		driver.close();
		
//		second way to handle alert
//		driver.switchTo().alert().getText();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("lokesh patil");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		AlertHandling alt = new AlertHandling();
		alt.alert();
	}

}
