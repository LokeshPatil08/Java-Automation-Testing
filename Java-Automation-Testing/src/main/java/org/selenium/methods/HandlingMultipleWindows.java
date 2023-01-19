package org.selenium.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// to work on new window
public class HandlingMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		//to work on new window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		String parentWin= driver.getWindowHandle();
		System.out.println(parentWin);
		
		Set<String>allWinID= driver.getWindowHandles();
		System.out.println(allWinID);
		
		Iterator<String> itr = allWinID.iterator();
		
		String parentWin_1 = itr.next();
		if(parentWin.equals(parentWin_1)) {
			System.out.println("id matching");
		}else {
			System.out.println("id not matching");
		}
		String childWinID=itr.next();
		System.out.println(childWinID);
		driver.switchTo().window(childWinID);  // to switch on child window
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWin);
		driver.close();

	}

}
