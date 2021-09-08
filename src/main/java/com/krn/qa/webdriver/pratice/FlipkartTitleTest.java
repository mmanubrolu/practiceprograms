package com.krn.qa.webdriver.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTitleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println("title :  " + title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Tile test case - PASSED");
		} else {
			System.out.println("Tile test case - FAILED");
		}

		Thread.sleep(3000);
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		System.out.println("close buttin text :  " + closeButton.getText());
		closeButton.click();
		
		Thread.sleep(3000);
		
		WebElement groceryLink = driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Grocery']"));
		groceryLink.click();
		
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println("url :  " + url);
		if(url.equals("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_c534fe5d-27a5-4fd9-af98-3af4ca018001_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=CBUR1Q46W5F1")) {
			System.out.println("URL test case - PASSED");
		} else {
			System.out.println("URL test case - FAILED");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
