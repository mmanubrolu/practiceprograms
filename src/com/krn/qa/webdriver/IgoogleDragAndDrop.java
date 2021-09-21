package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IgoogleDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='block-1']/h1"));
		//WebElement target = driver.findElement(By.xpath("//div[@id='block-4']"));
		WebElement target = driver.findElement(By.id("block-4"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
