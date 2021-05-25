package TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ShopPage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;

public class Shop {
	
	 ShopPage shop = new ShopPage(); 
	
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		BrowserUtility.waitForPageToLoad(3);
	}
	
	@Test(enabled=false)
	public void shopFillter() {
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		shop.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("shop"))).click();
		shop.shop.click();
		Actions action = new Actions(Driver.getDriver());
		//WebElement adjustButton = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("filterAdjustRight")));
		WebElement adjustButton = shop.filterAdjustRight;
		action.dragAndDropBy(adjustButton, -29, 0).build().perform();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("filterButton"))).click();
		shop.filterButton.click();	
	
			
	}
	@Test(enabled=false)
	public void shopCatatory() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		shop.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("shop"))).click();
		shop.shop.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("selenium"))).click();
		shop.seleniumButton.click();
		
		//String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("itemMessage"))).getText();
		String text = shop.itemMessage.getText();
		System.out.println(text);
		Assert.assertEquals(text,"Selenium Ruby");

			
	}
	
	@Test(enabled=false)
	public void sortingFuction() {
		
		shop.shop.click();
		Select select = new Select(shop.sortItem);
		select.selectByIndex(1);
		BrowserUtility.waitFor(5);
		String message = shop.popItem.getText();
		System.out.println(message);
		boolean text = message.contains("Thinking in HTML");
		Assert.assertTrue(text);
		
	}
	@Test(enabled=false)
	public void sortingFuction4() {
		
		shop.shop.click();
		Select select = new Select(shop.sortItem);
		select.selectByIndex(0);
		BrowserUtility.waitFor(5);
		String message = shop.defaultItem.getText();
		System.out.println(message);
		boolean text = message.contains("Android Quick Start Guide");
		Assert.assertTrue(text);
		
	}
	@Test(enabled=true)
	public void sortingFuction5() {
		
		shop.shop.click();
		Select select = new Select(shop.sortItem);
		select.selectByIndex(3);
		BrowserUtility.waitFor(5);
		String message = shop.newestItem.getText();
		System.out.println(message);
		boolean text = message.contains("HTML5 WebApp Develpment");
		Assert.assertTrue(text);
		
	}
	@Test(enabled=true)
	public void sortingFuction6() {
		
		shop.shop.click();
		Select select = new Select(shop.sortItem);
		select.selectByIndex(4);
		BrowserUtility.waitFor(5);
		String message = shop.lowPriceItems.getText();
		System.out.println(message);
		boolean text = message.contains("JS Data Structures and Algorithm");
		Assert.assertTrue(text);
		
	}
	@Test(enabled=true)
	public void sortingFuction7() {
		
		shop.shop.click();
		Select select = new Select(shop.sortItem);
		select.selectByIndex(5);
		BrowserUtility.waitFor(5);
		String message = shop.hightPriceItem.getText();
		System.out.println(message);
		boolean text = message.contains("Selenium Ruby");
		Assert.assertTrue(text);
		
	}
//	@AfterTest
//	public void afterTest() {
//		
//		Driver.closerDriver();
//	}

}