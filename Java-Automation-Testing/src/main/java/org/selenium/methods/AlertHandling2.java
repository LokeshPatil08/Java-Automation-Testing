package org.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class AlertHandling2 {
	public static WebDriver driver;
	@test
	public static void main(String []args) throws InterruptedException {
//		AlertHandling2 obj = new AlertHandling2();
		BaseUtility start = new BaseUtility();
		start.startup("https://demoqa.com/alerts");
		driver=BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert(); 
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		driver.close();
	}

}
