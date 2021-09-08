package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOnMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@class='darkGreyText']"))).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-cy='submenu_ActivitiesTours']")).click();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@class='darkGreyText']"))).build().perform();
			
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-cy='submenu_Giftcards']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
