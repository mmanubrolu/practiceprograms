package com.krn.qa.webdriver.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SleectAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> checkBoxesList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement item : checkBoxesList ) {
			//item.clear();
			item.click();
			Thread.sleep(1000);
		}
		
		driver.quit();

	}

}
