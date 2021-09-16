package com.krn.qa.webdriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class URLDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String titleText = driver.getTitle();
		System.out.println("titleText" + titleText);
		
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> iterator = windowHandle.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Window handles ::::" + iterator.next());
		}
		
		driver.findElement(By.id("uname")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manger");
		
		boolean isCheckBoxDisplayed = driver.findElement(By.id("rem")).isDisplayed();
		System.out.println("Window isCheckBoxDisplayed ::::" + isCheckBoxDisplayed);
		
		driver.findElement(By.id("rem")).click();
		isCheckBoxDisplayed = driver.findElement(By.id("rem")).isDisplayed();
		System.out.println("Window isCheckBoxDisplayed ::::" + isCheckBoxDisplayed);
		
		
		boolean isImageDisplayed = driver.findElement(By.id("homeImage")).isDisplayed();
		System.out.println("Window isImageDisplayed ::::" + isImageDisplayed);
		
		
		WebElement singleSelectDropDown = driver.findElement(By.id("city"));
		Select selectSingleSelectDropdown = new Select(singleSelectDropDown);
		
		List<WebElement> selectAllOptions = selectSingleSelectDropdown.getOptions();
		Iterator<WebElement> itr = selectAllOptions.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		driver.quit();

	}

}
 