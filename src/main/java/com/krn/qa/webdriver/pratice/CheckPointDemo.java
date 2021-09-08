package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CheckPointDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String title = driver.getTitle();
		System.out.print("Title : "+ title);
		Assert.assertEquals(title, "actiTIME - Login", "Login page title is not match");
		
		String url = driver.getCurrentUrl();
		System.out.println("url : "+ url);
		
		
		driver.close();
		driver.quit();

	}

}
