package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderDatePickUpRedBusApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[text()='14']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).sendKeys("22-Sep-2021");
		
		driver.findElement(By.xpath("//button[text()='>']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		Thread.sleep(5000);
		
		driver.quit();


	}

}
