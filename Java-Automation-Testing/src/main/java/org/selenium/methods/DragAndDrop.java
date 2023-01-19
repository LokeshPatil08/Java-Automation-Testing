package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class DragAndDrop {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/droppable");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement drag = driver.findElement(By.id("draggable"));  // for drag box
		WebElement drop = driver.findElement(By.id("droppable"));  // for drop box
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();
		Thread.sleep(2000);
		
//		navigate to another link
		driver.navigate().to("https://demoqa.com/dragabble");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		WebElement dragbox = driver.findElement(By.id("dragBox"));
		act.dragAndDropBy(dragbox, 140, 120).perform();
		
	}

}
