package com.krn.qa.webdriver.pratice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipWithHtmlDiv {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/nexzone-edge-tempered-glass-infinix-note-10/p/itm95aaa878c6960?pid=ACCG4G95GRA6HAMD&lid=LSTACCG4G95GRA6HAMDIEHRXP&marketplace=FLIPKART&store=tyy%2F4mr&srno=b_1_3&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_3_3.dealCard.OMU_3OFFE3TNEI71_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_3_NA_view-all_3&fm=neo%2Fmerchandising&iid=f92f6733-a009-4daf-81db-67520ef3289f.ACCG4G95GRA6HAMD.SEARCH&ppt=browse&ppn=browse&ssid=kqzn7iomk3a57e2o1630976966696");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// dynamic path for question mark tool tip
		/*WebElement questionmarkToolTip = driver.findElement(By.xpath("//div[@class='_3XINqE']//div[@class='Bv11UC']//span[text()='?']"));
		
		Thread.sleep(5000);
		
		// print the get text for tool tip
		String text = questionmarkToolTip.getText();
		System.out.println("text  ----->>>>> " + text);
		
		// click on tool tip
		questionmarkToolTip.click();
		
		Thread.sleep(5000);
		
		 get the individual elements directly but it is not recommended due dynamic nature of the content display
		 
		String text1 = driver.findElement(By.xpath("//h2[@id='shipping-charges-for-flipkart-assured-items']")).getText();
		
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'Shipping')]")).getText();
		
		String text3 = driver.findElement(By.xpath("//p[contains(text(),'Plus customers, shi')]")).getText();
		
		String text4 = driver.findElement(By.xpath("//p[contains(text(),'shipping charges = ')]")).getText();
		
		String text5 = driver.findElement(By.xpath("//p[contains(text(),'* For')]")).getText();
		
		System.out.println("tool tip information :: ");
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
		System.out.println(text5);
		
		//get the div text through dynamic path 
		String divTextForShipping = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//div[@class='Bv11UC']")).getText();
		
		// print the div text
		System.out.println("divTextForShipping  ::----- :::  " + divTextForShipping);
		
		questionmarkToolTip.sendKeys(Keys.ENTER);
		*/
		Thread.sleep(5000);
		
		/*WebElement questionmarkToolTip = driver.findElement(By.xpath("//div[text()='No Returns Applicable']//div[@class='Bv11UC']//span[@class='question']"));
		
		System.out.println("questionmarkToolTip  --->>>> " + questionmarkToolTip.getText());
		// click on tool tip
		questionmarkToolTip.click();
				
		Thread.sleep(5000);
		
		String divTextForNoReturns = driver.findElement(By.xpath("//div[@class='me3OWC _1vBu0N']/following-sibling::div[@class='_2MJMLX']//div[@class='Bv11UC']")).getText();
		
		// print the div text
		System.out.println("divTextForNoReturns  ::----- :::  " + divTextForNoReturns);
				*/
		
		
		WebElement questionMarkUpToolTip =  driver.findElement(By.xpath("//div[@class='_2MJMLX' and text()='Cash on Delivery available']//div[@class='Bv11UC']//span[@class='question']"));
		System.out.println("questionMarkUpToolTip" + questionMarkUpToolTip.getText());
		
	
		questionMarkUpToolTip.click();
		Thread.sleep(5000);
		
		String cashOnDeliveryToolTip = driver.findElement(By.xpath("//div[@class='me3OWC eUF4ak']/following-sibling::div[@class='_2MJMLX']//div[@class='Bv11UC']")).getText();
		System.out.println("cashOnDeliveryToolTip  --->>>> " + cashOnDeliveryToolTip);
		//quite the driver
		driver.quit();
	}

}
