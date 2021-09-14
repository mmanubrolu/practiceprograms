package com.krn.qa.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTCCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<String> windowHandlerSet = driver.getWindowHandles();
		System.out.println("Print window handlers :::");
		
		for(String item :windowHandlerSet ) {
			System.out.println(item);
		}
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).sendKeys("23/09/2021");
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
