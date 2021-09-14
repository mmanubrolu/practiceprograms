package com.krn.qa.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String titleText = driver.getTitle();
		System.out.println("titleText  --->>>>   " + titleText);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl ----->>> " + currentUrl);
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext()) {
			System.out.println("Window handlers :: -->> " + iterator.next());
		}

		driver.close();
	}

}
