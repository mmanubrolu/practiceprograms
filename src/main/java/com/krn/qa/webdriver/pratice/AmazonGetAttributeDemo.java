package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonGetAttributeDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String hrefValue = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
		System.out.println("hrefValue   --->>>> " + hrefValue);
		
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		String googlehref = driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("href");
		System.out.println("googlehref  ---->>>>> " + googlehref);
		
		driver.quit();
	}

}
