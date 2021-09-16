package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownLoadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "C:\\Users\\malli\\workspace");
		
		WebDriver driver = new FirefoxDriver(prof);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
