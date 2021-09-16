package com.krn.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartProductDeliverToolTip {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/realme-c21-cross-blue-64-gb/p/itmf4062d3f37c1a?pid=MOBGF4895YRNAHFZ&lid=LSTMOBGF4895YRNAHFZ3XABXU&marketplace=FLIPKART");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement deliveryToopTip =  driver.findElement(By.xpath("//span[@class='_1rQTjC']/..//span[@class='question']"));
		
		if(deliveryToopTip.isDisplayed()) {
			deliveryToopTip.click();
			String toolTipText = driver.findElement(By.xpath("//div[@class='_3XINqE']//div[@class='Bv11UC']")).getText();
			System.out.print("toolTipText   ::: " + toolTipText);
			
		} else {
			System.out.print("deliveryToopTip item was not fount");
		}
		
		driver.quit();
				
	}

}
