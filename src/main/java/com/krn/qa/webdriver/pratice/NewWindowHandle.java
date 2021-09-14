package com.krn.qa.webdriver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Packages']")).click();
		
		Set<String> windowHanleSet = driver.getWindowHandles();
		Iterator<String> iterator = windowHanleSet.iterator();
		//HashMap<String, String> windowHandlerMap = new HashMap<String, String>();
		/*while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println("item information ::: "+ item);
		}*/
		
		String irctcHomePage = iterator.next();
		String irctcPackagePage = iterator.next();
		
		driver.switchTo().window(irctcPackagePage);
		Thread.sleep(6000);
		
		driver.close();
		
		driver.switchTo().window(irctcHomePage);
		Thread.sleep(6000);
		
		driver.findElement(By.id("stationFrom")).sendKeys("Benguluru");
		
		Thread.sleep(6000);
		driver.close();
	}

}
