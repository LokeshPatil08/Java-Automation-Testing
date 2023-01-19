package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Exampale1 {
	public static void main(String[] orgs) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.co.in/");
		drive.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook");
//		drive.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")).click();
		drive.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
//		drive.close();
//		drive.quit();
		
		
//		System.setProperty("webdriver.ie.driver",projectPath+"\\drivers//IEDriverServer.exe" );
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://www.google.co.in/");
		
	}

}
