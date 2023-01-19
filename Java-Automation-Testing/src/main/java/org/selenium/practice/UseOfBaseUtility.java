package org.selenium.practice;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class UseOfBaseUtility {
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseUtility obj = new BaseUtility();
		obj.startup("https://www.google.co.in/");
		driver= BaseUtility.driver;
		
	}

}
