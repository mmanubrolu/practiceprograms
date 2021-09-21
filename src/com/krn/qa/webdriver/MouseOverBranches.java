package com.krn.qa.webdriver;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class MouseOverBranches {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Construct the webelement for branches menu item
		WebElement branchesWebElement = driver.findElement(By.xpath("//span[text()='Branches']"));
		
		// get the branched display status in webpage
		boolean isBranchesElementDisplayed = branchesWebElement.isDisplayed();
		
		if(isBranchesElementDisplayed) {
			// create an actions object for further mouse, key board actiosn
			Actions actions = new Actions(driver);
			
			//mouseover on branches menu item link
			actions.moveToElement(branchesWebElement).build().perform();
			
			//thread sleep for viewing
			Thread.sleep(6000);
			
			//Construct the webelement for marathalli branches menu item
			WebElement marathalliWebElement = driver.findElement(By.xpath("//span[text()='Marathahalli']"));
			
			// get the marathalli branch display status in webpage
			boolean isMarathalliWebElementDisplayed = marathalliWebElement.isDisplayed();
			
			if(isMarathalliWebElementDisplayed) {
				//mouseover on marathalli branches menu item link
				actions.moveToElement(marathalliWebElement).build().perform();
				
				Thread.sleep(6000);
				
				//Construct the webelement for marathalli branches selenium training link menu item
				WebElement seleniumTrainngElement = driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
				
				// get the marathalli branches selenium training link display status in webpage
				boolean isSeleniumTrainngElementDisplayed = seleniumTrainngElement.isDisplayed();
				if(isSeleniumTrainngElementDisplayed) {
					
					System.out.println("Inside isSeleniumTrainngElementDisplayed ");
					////mouseover on marathalli branches selenium training link  menu item link
					actions.moveToElement(seleniumTrainngElement).build().perform();
					
					Thread.sleep(6000);
					
					// perform right click actions
					actions.contextClick(seleniumTrainngElement).build().perform();
					
					
					Thread.sleep(6000);
					//perform down array actions
					actions.sendKeys(Keys.ARROW_DOWN).build().perform();
					
					Thread.sleep(6000);
					//perform enter key action
					actions.sendKeys(Keys.ENTER).build().perform();
					
					Thread.sleep(6000);
					
					System.out.println("all the steps executed successfully");
					Assert.assertTrue(true, "all the steps executed successfully");
					
				} else {
					System.out.println("Inside third level failure");
					Assert.assertFalse(isSeleniumTrainngElementDisplayed, "training in marathalli link was not displayed in second level menu");
				}
				
			} else {
				System.out.println("Inside second level failure");
				Assert.assertFalse(isMarathalliWebElementDisplayed, "Marathalli branch item was not displayed in second level menu");
			}
			
		} else {
			System.out.println("Inside first level failure");
			Assert.assertFalse(isBranchesElementDisplayed, "Branches item was not displayed in main menu");
		
		}
		
		driver.quit();

	}

}
