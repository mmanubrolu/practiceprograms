package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverKRN {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement courseOfferedElement = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(courseOfferedElement).build().perform();
		
		Thread.sleep(6000);
		
		actions.contextClick(courseOfferedElement).build().perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(6000);
		
		driver.quit();
		
		
	}

}
