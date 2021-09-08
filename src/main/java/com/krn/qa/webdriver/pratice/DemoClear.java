package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClear {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is begining of the program");
		
		//System.setProperty("webdriver.geckodriver.driver", "C:\\Malli Softwares\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("pratap");
		
		Thread.sleep(3000);
		un.clear();
		Thread.sleep(3000);
		un.sendKeys("admin");
		
		WebElement pw = driver.findElement(By.name("pwd"));
		pw.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		loginBtn.click();
		
		Thread.sleep(10000);
		
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		WebElement logo = driver.findElement(By.id("logo_aT"));
		boolean isLogoDisplayed = logo.isDisplayed();
		System.out.println("Logo displayed : " + isLogoDisplayed);
		
		
		WebElement logOut = driver.findElement(By.id("logoutLink"));
		logOut.click();
		
		driver.close();	
		
	}

}