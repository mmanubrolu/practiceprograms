package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadToolTipWithChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Malli Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement downloadLink = driver.findElement(By.xpath("//a[text()='Downloads']"));
		if(downloadLink.isDisplayed()) {
			downloadLink.click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
			
			Thread.sleep(9000);
		}

		driver.close();
	}

}
