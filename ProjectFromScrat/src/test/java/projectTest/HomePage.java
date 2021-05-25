package projectTest;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePagePage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;
import utility.ListenersTestNG;


//@Listeners(ListenersTestNG.class)
public class HomePage {
	
	 HomePagePage home = new HomePagePage();
	 Actions action = new Actions(Driver.getDriver());
	 
		@BeforeMethod
		public void windowSetup() {
			
			Driver.getDriver().get(ConficReader.getProperty("url"));
			Driver.getDriver().manage().deleteAllCookies();
			Driver.getDriver().manage().window().maximize();
			BrowserUtility.waitForPageToLoad(3);
		}
	
		
		@Test
		public void test1() throws InterruptedException {
			
			WebElement element = home.clothButton;
			action.moveToElement(element).build().perform();
			
			BrowserUtility.waitFor(5);
			
			WebElement element1 = home.menLink;
			action.moveToElement(element1).build().perform();
			
			BrowserUtility.waitFor(5);
			WebElement element2 = home.shirtLink;
			action.moveToElement(element2).click().perform();
						
			List<WebElement> list = home.itemPrice;
			System.out.println(list.get(0).getText());
			double max =Double.parseDouble((list.get(0).getText()));
			double min = Double.parseDouble((list.get(0).getText()));
			
			
			
			for(WebElement elementPrice : list) {	
				
				String num = elementPrice.getText();			
				System.out.println(num);
				
				double price = Double.parseDouble(num);
				
				if(price > max) {
					max = price;
					
				}
				if(price < min) {
					
					min = price;
				}
				
				
			}
			
			for(int i =0; i < list.size(); i++) {
				 Double.parseDouble((list.get(i).getText()));
				
				if(Double.parseDouble((list.get(i).getText())) == max) {
					
					list.get(i).click();
					
				}
				
			}
			
			Set<String> handel = Driver.getDriver().getWindowHandles();
			Iterator<String> it = handel.iterator();
			
			String parent = it.next();
			String child = it.next();
			
			Driver.getDriver().switchTo().window(child);
			
			
			
			
			
			Select select1 = new Select(home.sizeList);
			select1.selectByIndex(3);
//			Select select2 = new Select(home.colorList);
//			select2.selectByIndex(3);
			BrowserUtility.waitFor(5);
			home.addToCartButton.click();
			
			home.cart.click();
			
			
			
			System.out.println("Max is " +max);	
			
//			System.out.println("Max item price is " + max);
//			System.out.println("Min item price is " + min);
//			
//		double expectPrice = 62.38;
//		double actualPrice = max;
//				
//		Assert.assertEquals(expectPrice, actualPrice);	 
//		
		
		}
		
//		@AfterTest
//		public static void afterTest() {
//			
//			Driver.closerDriver();
//		}
		

}
