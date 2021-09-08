package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UrlCheckPointDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(15000);
		
		String expectedUrl = "https://demo.actitime.com/user/submit_tt.do";
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println("actualUrl : " + actualUrl + " expectedUrl : " + expectedUrl);
		Assert.assertEquals(actualUrl, expectedUrl, "Text is not match");
		
		driver.quit();

	}

}
