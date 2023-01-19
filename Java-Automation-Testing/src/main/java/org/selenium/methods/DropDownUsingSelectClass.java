package org.selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectClass {
	public static void main(String[] args) {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement colourmenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
		Select slt = new Select(colourmenu);    // we have to pass the webelement obj in constructor
//		slt.selectByVisibleText("Purple");
//		slt.selectByValue("4");
		slt.selectByIndex(4);
		
		String ss= slt.getFirstSelectedOption().getText();//this method return selected elements
		System.out.println(ss);
		
		
		List<WebElement>colourddloptions = slt.getOptions();
		for(int i = 0; i<colourddloptions.size();i++) {
//			System.out.println(colourddloptions.get(i).getText().equals("Purple"));
			if(colourddloptions.get(i).getText().equals("Purple")) {
				slt.selectByVisibleText("Purple");
				System.out.println(ss);
				break;
			}
		}
		
	}

}
