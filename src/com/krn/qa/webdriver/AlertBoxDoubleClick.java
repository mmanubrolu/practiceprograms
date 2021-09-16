package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement alertButton = driver.findElement(By.id("dblClkBtn"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(alertButton).build().perform();
		
		WebDriverWait driverWait = new WebDriverWait(driver, 6);
		ExpectedCondition<Alert> expt =  ExpectedConditions.alertIsPresent();
	
		System.out.println("expt  --->  " + expt.toString());
		driverWait.until(ExpectedConditions.alertIsPresent());
		
		
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText   --->>>  " + alertText);
		
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
