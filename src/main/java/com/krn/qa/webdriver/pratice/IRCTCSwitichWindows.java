package com.krn.qa.webdriver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTCSwitichWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		System.out.println("Window handles ::: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[text()='Packages']")).click();
		Thread.sleep(6000);
		Set<String>  windowHandles1 = driver.getWindowHandles();
		Iterator<String> iterator1 = windowHandles1.iterator();
		System.out.println("Window1 handles ::: " + windowHandles1.size());
		HashMap<String, String> windowMap = new HashMap<String,String>();
		
		if(iterator1.hasNext()) {
		windowMap.put("homePage", iterator1.next());
		windowMap.put("package", iterator1.next());
		}
		
		Thread.sleep(6000);
		
		driver.switchTo().window(windowMap.get("package"));
		Thread.sleep(6000);
		System.out.println("package title :: " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Origin/Destination City']")).sendKeys("bangalore");
		Thread.sleep(6000);
		
		driver.close();
		driver.switchTo().window(windowMap.get("homePage"));
		Thread.sleep(6000);
		System.out.println("home page title :: " + driver.getTitle());
		
		Thread.sleep(6000);
		driver.quit();
	}

}
