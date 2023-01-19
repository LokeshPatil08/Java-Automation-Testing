package org.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
  @BeforeClass
  public void setup() {
	  String projectPath = System.getProperty("user.dir");
	  System.out.println(projectPath);	
	  System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  @BeforeMethod
  public void openSite() throws InterruptedException {
	  driver.get("https://demoqa.com/login");
	  driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void newUserDetails() throws InterruptedException {
	  driver.findElement(By.id("newUser")).click();
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("lokesh");
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("patil");
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("loki008");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc123");
	  Thread.sleep(2000);
	  try {
	  WebElement cptcha =driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
	  Actions act = new Actions(driver);
	  act.moveToElement(cptcha).perform();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  driver.findElement(By.xpath("//button[@id='register']")).click();
	  
	  
  }
}
