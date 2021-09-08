package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverPratice {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("this is begining of program");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		
		WebElement pw = driver.findElement(By.name("pwd"));
		pw.sendKeys("manager");
		
		
		WebElement loginBtn= driver.findElement(By.id("loginButton"));
		loginBtn.click();
		
		Thread.sleep(20000);
		driver.findElement(By.id("logoutLink")).click();
	
	}

}
