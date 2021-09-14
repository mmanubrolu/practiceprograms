package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipWithTitleAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		
		Thread.sleep(6000);
		
		String toolTipText = driver.findElement(By.xpath("//img[@src='https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-m32-5g-new.jpg']")).getAttribute("title");
		
		System.out.println("toolTipText  --->>>> " + toolTipText);
		
		driver.quit();
	}

}
