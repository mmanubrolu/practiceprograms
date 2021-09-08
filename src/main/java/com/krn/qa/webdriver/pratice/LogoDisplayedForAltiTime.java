package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogoDisplayedForAltiTime {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		boolean logoStatus = driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		
		System.out.println("logoStatus   ---> " + logoStatus);

		driver.quit();
	}

}
