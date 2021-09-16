package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertToolTip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if (driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
			String alertText = driver.switchTo().alert().getText();
			System.out.println("alertText  ::: " + alertText);
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		}
		driver.quit();
	}

}
