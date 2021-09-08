package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxCheckPointDemo {
	


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean isCheckBoxSelected = driver.findElement(By.id("rem")).isSelected();
		System.out.println("isCheckBoxSelected  :: " + isCheckBoxSelected);
		
		/*WebDriverWait driverWait = new WebDriverWait(driver, 3);
		driverWait.until(ExpectedConditions.elementToBeSelected(By.id("rem")));
		*/Thread.sleep(3000);
		
		driver.findElement(By.id("rem")).click();
		boolean isCheckBoxSelected1 = driver.findElement(By.id("rem")).isSelected();
		System.out.println("isCheckBoxSelected1  :: " + isCheckBoxSelected1);
		Thread.sleep(3000);
		
		driver.findElement(By.id("rem")).click();
		boolean isCheckBoxSelected2 = driver.findElement(By.id("rem")).isSelected();
		System.out.println("isCheckBoxSelected2  :: " + isCheckBoxSelected2);
		Thread.sleep(3000);
		
		if(!isCheckBoxSelected2) {
			driver.findElement(By.id("rem")).click();
		}
		driver.quit();
	}

}
