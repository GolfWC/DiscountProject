package test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.ConficReader;
import testBase.Driver;
import utility.BrowserUtility;
import utility.ListenerTestNG;



@Listeners(ListenerTestNG.class)
public class HomeTest {
	
	HomePage home = new HomePage();
	Actions action = new Actions(Driver.getDriver());
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		
		
	}

	@Test(enabled = false)
	public void homeVerify() {
		
		String name = Driver.getDriver().getTitle();
		System.out.println(name);
				
	}
	
	@Test
	public void dress() {
		
		home.dress.click();
		
		List<WebElement> list = home.items;
		int count=0;
		for(int i = 0; i < list.size(); i++) {
			
			String item = list.get(i).getText();
			
			if(item.contains("%")) {
				
				action.moveToElement(list.get(i)).build().perform();
				home.addToCart.get(i).click();
				home.continueShoppingButton.click();
				count++;
			}
		}
		BrowserUtility.waitFor(5);
		home.cartButton.click();
		
		for(int i =0 ; i < count; i ++) {
			
			if(!home.amount.getAttribute("value").equals("3")) {
				home.plusButton.get(i).click();
				home.plusButton.get(i).click();
				
				
			}
		}
		
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		System.out.println("Git hub pushing in eclips");
		
	}
	 
	
	@AfterTest
	public static void afterTest() {
		
		Driver.closerDriver();
	}
	
}
