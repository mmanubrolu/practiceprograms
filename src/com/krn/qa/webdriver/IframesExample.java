package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframesExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement secondFrame = driver.findElement(By.xpath("//frameset//frame[@name='secondframe']"));
		driver.switchTo().frame(secondFrame);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='name1']")).sendKeys("Mallikarjuna manubrolu");
		driver.findElement(By.xpath("//input[@name='rep']")).click();
		
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(6000);
		WebElement firstFrame = driver.findElement(By.xpath("//frameset//frame[@src='frame_a.html']"));
		driver.switchTo().frame(firstFrame);
		String frameOneText = driver.findElement(By.xpath("//h2[contains(text(),'first')]")).getText();
		System.out.println("frameOneText  :::: " + frameOneText);
		
		Thread.sleep(6000);
		
		driver.quit();
		
	}

}
