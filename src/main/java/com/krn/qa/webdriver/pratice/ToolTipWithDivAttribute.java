package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipWithDivAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/realme-c11-2021-cool-grey-64-gb/p/itmbd856acb97c38?pid=MOBG5BCDJ68N57TH&lid=LSTMOBG5BCDJ68N57THMYDYHT&marketplace=FLIPKART");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//div[@class='_20XEBf']//span[@class='_1rQTjC']/..//div[@class='Bv11UC']//span[@class='question']")).click();
		driver.findElement(By.xpath("//div[@class='_2MJMLX' and text()='GST invoice available']/..//span[@class='question']")).click();
		Thread.sleep(6000);
		
		//String divText = driver.findElement(By.xpath("//div[@class='_20XEBf']//span[@class='_1rQTjC']/..//div[@class='Bv11UC']")).getText();
		String divText = driver.findElement(By.xpath("//div[@class='_2MJMLX' and text()='GST invoice available']")).getText();
		System.out.println("divText 1  -->> " + divText);
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='_2MJMLX' and text()='7 Days Replacement Policy']//div[@class='Bv11UC']//span[@class='question']")).click();
		Thread.sleep(6000);
		
		divText = driver.findElement(By.xpath("//div[@class='_2MJMLX' and text()='7 Days Replacement Policy']//div[@class='Bv11UC']")).getText();
		System.out.println("divText 2  -->> " + divText);
		
		Thread.sleep(6000);
		driver.quit();
	}

}
