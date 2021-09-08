package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TextCheckPointDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(15000);
		
		String expectedText = "Enter Time-Track";
		String actualText = driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		
		System.out.println("actualText : " + actualText + " expectedText : " + expectedText);
		Assert.assertEquals(actualText, expectedText, "Text is not match");
		
		driver.quit();
		

	}

}
