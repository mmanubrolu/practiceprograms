package com.krn.qa.webdriver.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FlipkartMouseOverDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000); 
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		//WebDriverWait driverWait = new WebDriverWait(driver , 5);
		//driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
		closeButton.click();
		
		
		WebElement element = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		//driverWait = new WebDriverWait(driver , 5);
		//driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='exehdJ']")));
		
		Thread.sleep(3000); 
		Actions actions = new Actions(driver);
		
		actions.moveToElement(element).build().perform();
		
		
		// WebElement notificationPref = driver.findElement(By.linkText("Notification Preferences"));
		WebElement notificationPref = driver.findElement(By.linkText("Sell on Flipkart"));
		
/* ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell on Flipkart"));
		System.out.println("ExpectedConditions.visibilityOfElementLocated(locator)" + );
		System.out.println("ExpectedConditions.invisibilityOfElementLocated(By.linkText(\"Sell on Flipkart\"))" + ExpectedConditions.invisibilityOfElementLocated(By.linkText("Sell on Flipkart")));
	*/	Thread.sleep(3000); 
		WebDriverWait driverWait = new WebDriverWait(driver , 5);
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell on Flipkart")));
		
		System.out.println("ExpectedConditions.invisibilityOfElementLocated(By.linkText(\"Sell on Flipkart\"))" + ExpectedConditions.invisibilityOfElementLocated(By.linkText("Sell on Flipkart")));
		System.out.println("notificationPref ::  " + notificationPref.getText() + "     Enabled :   " + notificationPref.isEnabled() + "    Displayed  :" + notificationPref.isDisplayed());
		
		notificationPref.click();
		
		Thread.sleep(5000); 
		
		driver.navigate().back();
		
		Thread.sleep(5000); 
		
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Electronics']"))).build().perform();
		
		Thread.sleep(5000); 
		
		/*if (notificationPref.isEnabled()) {
			System.out.println("Before action click:");
			notificationPref.click();
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(3000); 
			System.out.println("Title ::: " + driver.getTitle());
			System.out.println("url ::: " + driver.getCurrentUrl());
		}*/
		
		
		/*WebDriverWait driverWait = new WebDriverWait(driver, 5000);
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Notification Preferences")));
		
		List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='exehdJ']"));
		int size = elementList.size();
		System.out.println("dynamic elements size : " + size);*/
		
	
		
		driver.quit();
		

	}

}
