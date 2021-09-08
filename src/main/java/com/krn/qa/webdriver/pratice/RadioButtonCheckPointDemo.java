package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCheckPointDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		
		boolean isRadioButtonSelected = driver.findElement(By.id("female")).isSelected();
		System.out.println("isRadioButtonSelected  :: " + isRadioButtonSelected);
		
		/*WebDriverWait driverWait = new WebDriverWait(driver, 3);
		driverWait.until(ExpectedConditions.elementToBeSelected(By.id("rem")));
		*/Thread.sleep(3000);
		
		driver.findElement(By.id("female")).click();
		boolean isRadioButtonSelected1 = driver.findElement(By.id("female")).isSelected();
		System.out.println("isRadioButtonSelected1  :: " + isRadioButtonSelected1);
		Thread.sleep(3000);
		
		driver.findElement(By.id("female")).click();
		boolean isRadioButtonSelected2 = driver.findElement(By.id("female")).isSelected();
		System.out.println("isRadioButtonSelected2  :: " + isRadioButtonSelected2);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
