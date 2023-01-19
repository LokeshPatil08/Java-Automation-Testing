package org.selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {
	public static void main(String[] args) {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement colourMenu = driver.findElement(By.id("cars"));
		Select slt = new Select(colourMenu);
		//we dont have select all method so we store our cars in list
		List<WebElement> multislt = slt.getOptions();
		for (int i = 0; i <multislt.size(); i++) {
			slt.selectByIndex(i);
			System.out.println(i);
		}
		
	}

}
