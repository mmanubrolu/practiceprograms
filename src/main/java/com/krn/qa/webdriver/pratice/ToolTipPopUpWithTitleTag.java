package com.krn.qa.webdriver.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipPopUpWithTitleTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// click on search area for mobiles
		driver.findElement(By.id("topsearch-text")).sendKeys("mobiles");
		WebElement SearchBox = driver.findElement(By.id("topsearch-text"));
		SearchBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[text()='Go']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		Thread.sleep(5000);
		
		String toolTipPopUpStr = driver.findElement(By.xpath("//img[contains(@src,'y-m32-5g')]")).getAttribute("title");
		System.out.println("toolTipPopUpStr  ---->> " + toolTipPopUpStr);
		
		String watchToolTip = driver.findElement(By.xpath("//img[contains(@src,'y-watch4-cl')]")).getAttribute("title");
		System.out.println("watchToolTip   ---->>>> " + watchToolTip);
		
		String mobileToopTip = driver.findElement(By.xpath("//img[contains(@src,'y-a32-4g')]")).getAttribute("title");
		System.out.println("mobileToopTip   ----->>>> " + mobileToopTip);
		
		driver.quit();
	}

}
