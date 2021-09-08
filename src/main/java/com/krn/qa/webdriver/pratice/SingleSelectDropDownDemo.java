package com.krn.qa.webdriver.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement singleDropDown = driver.findElement(By.id("city"));
		
		Select selectDropDown = new Select(singleDropDown);
		
		selectDropDown.selectByIndex(2);
		Thread.sleep(3000);
		
		selectDropDown.selectByValue("3");
		Thread.sleep(3000);
		
		selectDropDown.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		
		selectDropDown.deselectByValue("Chennai");
		Thread.sleep(3000);
		
		List<WebElement> listOptions = selectDropDown.getOptions();
		Thread.sleep(3000);
		
		System.out.println("all options : " );
		for(WebElement item :listOptions ) {
			System.out.println(item.getText());
		}
		
		selectDropDown.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		List<WebElement> selectListOptions = selectDropDown.getAllSelectedOptions();
		
		System.out.println("all select options  : " );
		for(WebElement item :selectListOptions ) {
			System.out.println(item.getText());
		}
		
		driver.quit();
	}

}
