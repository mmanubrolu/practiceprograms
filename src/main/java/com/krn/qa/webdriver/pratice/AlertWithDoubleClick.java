package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-click to generate alert box']"));
		
		actions.doubleClick(doubleClickButton).build().perform();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
			
		actions.doubleClick(doubleClickButton).build().perform();
		
		Thread.sleep(4000);
		
		String alertText = driver.switchTo().alert().getText();
		
		System.out.println("alertText  ----->>>> " + alertText);
		
		driver.switchTo().alert().accept();
		
	}

}
