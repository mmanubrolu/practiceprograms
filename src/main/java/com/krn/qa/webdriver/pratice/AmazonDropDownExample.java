package com.krn.qa.webdriver.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDownExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement dropDownItem = driver.findElement(By.id("searchDropdownBox"));
		Select selectOptions = new Select(dropDownItem);
		
		System.out.println("Select is multi select drop down : " + selectOptions.isMultiple());
		Thread.sleep(3000);
		
		List<WebElement> dropDownList = selectOptions.getOptions();
		
		System.out.println("All possible items : ");
		for(WebElement item : dropDownList ) {
			System.out.println(item.getText());
		}
		
		selectOptions.selectByIndex(5);
		Thread.sleep(3000);
		System.out.println("Seleted item ::  1 ::: ");
		dropDownList = selectOptions.getAllSelectedOptions();
		for(WebElement item : dropDownList ) {
			System.out.println(item.getText());
		}
		
		
		selectOptions.selectByValue("search-alias=lawngarden");
		Thread.sleep(3000);
		System.out.println("Seleted item ::  2 ::: " );
		dropDownList = selectOptions.getAllSelectedOptions();
		for(WebElement item : dropDownList ) {
			System.out.println(item.getText());
		}
		
		selectOptions.selectByVisibleText("Musical Instruments");
		Thread.sleep(3000);
		System.out.println("Seleted item ::  3 ::: "  );
		dropDownList = selectOptions.getAllSelectedOptions();
		for(WebElement item : dropDownList ) {
			System.out.println(item.getText());
		}
		
		Actions accountActionsPointer = new Actions(driver);
		accountActionsPointer.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Your Recommendations']")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@data-ref-tag='nav_em_1_1_1_6']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='All-new Echo (4th Gen)']")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
