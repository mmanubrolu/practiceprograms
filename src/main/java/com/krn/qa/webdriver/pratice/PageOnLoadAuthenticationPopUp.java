package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageOnLoadAuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		Thread.sleep(9000);
		
		String text = driver.findElement(By.xpath("//h3[text()='Digest Auth']")).getText();
		System.out.println("text  --- >> >>> " + text);
		
		driver.quit();

	}

}
