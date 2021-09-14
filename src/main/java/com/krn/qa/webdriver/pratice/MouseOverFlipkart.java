package com.krn.qa.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Set<String> windowHandle =  driver.getWindowHandles();
		Iterator< String> iterator = windowHandle.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(6000);
		
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		
		Thread.sleep(6000);
		WebElement computrPerPhels = driver.findElement(By.xpath("//a[contains(@href,'XCY')]"));
		actions.moveToElement(computrPerPhels).build().perform();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[text()='Router']")).click();
		
		Thread.sleep(6000);
		WebElement router = driver.findElement(By.xpath("//a[contains(text(),'RE650')]"));
		Thread.sleep(6000);
		System.out.println("text " + router.getText());
		System.out.println("tag " + router.getTagName());
		System.out.println("url " + driver.getCurrentUrl());
		System.out.println("displayed " + router.isDisplayed());
		
		router.click();
		Thread.sleep(6000);
		
		driver.quit();
	}

}
