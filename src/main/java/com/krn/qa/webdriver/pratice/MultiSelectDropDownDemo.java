package com.krn.qa.webdriver.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement cities = driver.findElement(By.id("cities"));
		
		Select dropDown = new Select(cities);
		
		dropDown.selectByIndex(2);
		Thread.sleep(3000);
		
		dropDown.selectByValue("1");
		Thread.sleep(3000);
		
		dropDown.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		List<WebElement> allOptions = dropDown.getOptions();
		System.out.println("All options :");
		for(WebElement item: allOptions ) {
			System.out.println(item.getText());
		}
		
		
		List<WebElement> selectedOptions = dropDown.getAllSelectedOptions();
		System.out.println("Selected options: ");
		for(WebElement item : selectedOptions ) {
			System.out.println(item.getText());
		}
		
		dropDown.deselectAll();
		Thread.sleep(3000);
		
		dropDown.selectByValue("1");
		Thread.sleep(3000);
		
		dropDown.selectByValue("1");
		Thread.sleep(3000);
		
		dropDown.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		List<WebElement> allOptions1 = dropDown.getOptions();
		System.out.println("All options :");
		for(WebElement item: allOptions1 ) {
			System.out.println(item.getText());
		}
		
		
		List<WebElement> selectedOptions1 = dropDown.getAllSelectedOptions();
		System.out.println("Selected options: ");
		for(WebElement item : selectedOptions1 ) {
			System.out.println(item.getText());
		}
		
		dropDown.deselectByIndex(2);
		Thread.sleep(3000);
		
		dropDown.selectByValue("1");
		Thread.sleep(3000);
		
		dropDown.deselectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
