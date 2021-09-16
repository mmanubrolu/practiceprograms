package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConfirmationToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Malli Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement alertElement = driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
		if(alertElement.isDisplayed()) {
			alertElement.click();
			Thread.sleep(6000);
			
			driver.switchTo().alert().dismiss();
			Thread.sleep(6000);
			alertElement.click();
			Thread.sleep(6000);
			String alertText = driver.switchTo().alert().getText();
			System.out.println("alertText  --->>>>> " + alertText);
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
			Thread.sleep(6000);
			
		}
		
		driver.quit();
	}

}
