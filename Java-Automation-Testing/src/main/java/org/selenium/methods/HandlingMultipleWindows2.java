package org.selenium.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		String parentWin= driver.getWindowHandle();
		System.out.println(parentWin);
		
		Set<String>allWinID= driver.getWindowHandles();
		System.out.println(allWinID);
		
		Iterator<String> itr = allWinID.iterator();
//		Iterator<String> itr1= driver.getWindowHandles().iterator();
		
		String childWinID = null;
		int i=0;
		while(i<allWinID.size()) {
			String tempId = itr.next();
			if(!tempId.equals(parentWin)) {
				childWinID = tempId;
				driver.switchTo().window(childWinID);
//				if(driver.getTitle().equals("ChildWindow")) {
//					
//				}
				if(driver.findElement(By.id("sampleHeading")).isDisplayed()) {
					break;
				}
			}
			i++;
		}
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.close();
		
		driver.switchTo().window(parentWin);
		driver.close();
	}

}
