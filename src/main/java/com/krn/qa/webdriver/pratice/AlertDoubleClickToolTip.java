package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDoubleClickToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Malli Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement alertElement = driver.findElement(By.id("dblClkBtn"));
		if(alertElement.isDisplayed()) {
			Actions actions = new Actions(driver);
			actions.doubleClick(alertElement).build().perform();
			Thread.sleep(6000);
			System.out.println("alert text :::: " + driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			Thread.sleep(6000);
		}
		
		driver.quit();
	}

}
