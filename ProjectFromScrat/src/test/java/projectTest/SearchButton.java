package projectTest;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.SearchPage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;
import utility.ListenersTestNG;


@Listeners(ListenersTestNG.class)
public class SearchButton {
	
		SearchPage search = new SearchPage();
		
		@BeforeMethod
		public void windowSetup() {
			
			Driver.getDriver().get(ConficReader.getProperty("url"));
			Driver.getDriver().manage().deleteAllCookies();
			Driver.getDriver().manage().window().maximize();
			BrowserUtility.waitForPageToLoad(3);
		}
		
		@Test(enabled = false)
		public void validProduct() {
			search.searchBox.sendKeys(ConficReader.getProperty("product1"));
			search.searchButt.click();
			
			
		}
		
		@Test(enabled = false)
		public void invalidProduct() {
			search.searchBox.sendKeys(ConficReader.getProperty("product2"));
			search.searchButt.click();
			
			String text = search.invalidText.getText();
			System.out.println(text);
			Assert.assertTrue(text.contains("We couldn't find any results"));
			
			
		}
		
		
//		@AfterTest
//		public static void afterTest() {
//			
//			Driver.closerDriver();
//		}
}