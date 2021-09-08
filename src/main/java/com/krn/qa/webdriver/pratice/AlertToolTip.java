package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertToolTip {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText  ---->>>> "  + alertText);
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();

	}

}
