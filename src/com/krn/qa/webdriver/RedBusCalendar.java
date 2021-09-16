package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("title" + driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='>']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
		Thread.sleep(6000);
		//WebElement source = driver.findElement(By.id("src"));
		driver.findElement(By.id("src")).sendKeys("Banagalore");
		//Actions actions = new Actions(driver);
		//actions.keyDown(source, Keys.ARROW_DOWN).build().perform();
	
		Thread.sleep(6000);
		
		driver.findElement(By.id("dest")).sendKeys("Guntur");
		
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(6000);
		
		System.out.println("title" + driver.getTitle());
		
		driver.quit();
	}

}
