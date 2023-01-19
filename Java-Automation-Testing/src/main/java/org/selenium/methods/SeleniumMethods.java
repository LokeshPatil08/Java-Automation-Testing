package org.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class SeleniumMethods {
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseUtility open = new BaseUtility();
		open.startup("https://demoqa.com/radio-button");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("ToolsQA")) {
			System.out.println("title match");
		}else {
			System.out.println("title not match");
		}
		
		// current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement noBtn;
		noBtn=driver.findElement(By.xpath("//label[text()='No']/preceding::input[1]"));
		String value = noBtn.getAttribute("class");
		if(value.endsWith("disabled"))
		{
			System.out.println("no btn is disable");
		}else {
			System.out.println("btn is disable");
		}
		
		driver.findElement(By.id("yesRadio")).click();;
		WebElement selectAns = driver.findElement(By.cssSelector(".text-success"));
		String text = selectAns.getText();
		System.out.println(text);
	}

}