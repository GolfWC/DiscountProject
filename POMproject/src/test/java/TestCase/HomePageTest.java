package TestCase;



import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePagePage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;
import utility.ListernersTestNG;

@Listeners(ListernersTestNG.class)
public class HomePageTest {

	 HomePagePage home = new HomePagePage();
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		BrowserUtility.waitForPageToLoad(3);
	}
	
	@Test(enabled=false)
	
	public void verifyThreeSlider() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("shop"))).click();
		home.shop.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("home"))).click();
		home.home.click();
		
		//List<WebElement> lists = Driver.getDriver().findElements(By.xpath(ConficReader.getProperty("slider")));
		List<WebElement> lists = home.slider;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		
	}
	
	@Test(enabled=false)
	public void verifyThreeArival() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("shop"))).click();
		home.shop.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("home"))).click();
		home.home.click();
		//List<WebElement> lists = Driver.getDriver().findElements(By.xpath(ConficReader.getProperty("threeArival")));
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		
		Assert.assertEquals(3, lists.size());
		
	}
	
	@Test(enabled=false)
	public void imageArivalNavigate() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		
	}
	
	@Test(enabled=false)
	public void imageArivalDescription() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		Driver.getDriver().navigate().back();
		String text = home.productDescription.getText();
		boolean description = text.contains("The Selenium WebDriver Recipes book is a quick problem-solving guide ");
		System.out.println(description);
		Assert.assertTrue(description);	
		
	}
	@Test(enabled=false)
	public void reviewTap() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		Driver.getDriver().navigate().back();
		home.reviewTap.click();
		String text = home.reviewText.getText();
		BrowserUtility.waitFor(5);
		boolean description = text.contains("Be the first to review “Selenium Ruby”");
		System.out.println(description);
		Assert.assertTrue(description);	
		
	}
	@Test(enabled=false)
	public void arivalAddToBasket() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		
	}
	@Test(enabled=false)
	public void addMoreBook() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.costomQuantity.clear();
		String num = home.costomQuantity.getAttribute("max");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num)+1;
		String maxAmount = String.valueOf(itemAmount);
		home.costomQuantity.sendKeys(maxAmount);
		home.addToBasketButton.click();
		
		BrowserUtility.waitFor(10);
		
		// can not get message from popup worning
		
	}
	@Test(enabled=false)
	public void checkOut() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		home.checkOutButton.click();
		String text = home.billingDetail.getText();
		BrowserUtility.waitFor(5);
		boolean description = text.contains("Billing Details");
		System.out.println(description);
		Assert.assertTrue(description);	
		
	}
	
	
	@Test(enabled=false)
	public void coupong() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		home.checkOutButton.click();
		home.coupon.click();
		home.couponCode.clear();
		home.couponCode.sendKeys("krishnasakinala");
		home.applyCouponButton.click();
		BrowserUtility.waitFor(5);
		String text = home.applyCouponText.getText();
		
		boolean description = text.contains("Coupon code applied successfully");
		System.out.println(text);
		Assert.assertTrue(description);	
		// 9 done
	}
	@Test(enabled=false)
	public void coupongLimit() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival3.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		String num = home.quantity.getAttribute("value");
		System.out.println("quantity is "+ num);
		int itemAmount =Integer.parseInt(num);
		Assert.assertTrue(itemAmount>0);
		home.checkOutButton.click();
		home.coupon.click();
		home.couponCode.clear();
		home.couponCode.sendKeys("krishnasakinala");
		home.applyCouponButton.click();
		BrowserUtility.waitFor(5);
		String text = home.applyCouponLimit.getText();
		
		boolean description = text.contains("The minimum spend for this coupon is ₹450.00.");
		System.out.println(text);
		Assert.assertTrue(description);	
		// 10 done
	}
	@Test(enabled= false)
	public void removeBook() {		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.addToBasketButton.click();
		home.viewBasket.click();
		home.remove.click();
		BrowserUtility.waitFor(5);
		String actualText =home.removeText.getText();
		System.out.println(actualText);
		String expectedText = "Your basket is currently empty.";
		Assert.assertTrue(actualText.contains(expectedText));	
	}
	@Test(enabled=false)
	public void addBook() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		BrowserUtility.waitFor(5);
		home.updateQuantity.clear();
		home.updateQuantity.sendKeys("3");
		BrowserUtility.waitFor(5);
		
		boolean display =home.updatePrice.isDisplayed();
	
		Assert.assertTrue(display);	
		
		
		

	}
	
	@Test(enabled = false)
	public void finalPrice() {		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		BrowserUtility.waitFor(5);
		home.updateQuantity.clear();
		home.updateQuantity.sendKeys("3");
		BrowserUtility.waitFor(5);
		home.updateBasket.click();
		boolean display =home.subTotal.isDisplayed();
		System.out.println(home.subTotal.getText());
		Assert.assertTrue(display);		
	}
	
	@Test(enabled=false)
	public void updateBasket() {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		BrowserUtility.waitFor(5);
		home.updateQuantity.clear();
		home.updateQuantity.sendKeys("3");
		BrowserUtility.waitFor(5);
		
		boolean display =home.updatePrice.isDisplayed();
	
		Assert.assertTrue(display);	
		
		
		

	}
	
	@Test(enabled=false)
	public void checkOut16() throws ParseException {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		home.updateQuantity.clear();
		home.updateQuantity.sendKeys("13");
		home.updateBasket.click();

		BrowserUtility.waitFor(5);
		String subTotal = home.subTotal.getText();
		String newSubTotal = subTotal.substring(1);
		System.out.println(newSubTotal);
		
		String total = home.total.getText();
		String newTotal = total.substring(1);
		System.out.println(newTotal);
		
		NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		Number number1 = format.parse(newSubTotal);
		double num1 = number1.doubleValue();
		System.out.println(num1);
//		double num1 = Double.parseDouble(newSubTotal);
//		System.out.println(num1);
		Number number2 = format.parse(newTotal);
		double num2 = number2.doubleValue();
		System.out.println(num2);
//		double num2 = Double.parseDouble(newTotal);
//		System.out.println(num2);
		if(num2 > num1) {
			Assert.assertTrue(true);
			
		}else {
			Assert.assertFalse(false);
			
		}

		home.checkOutButton.click();
		String text = home.billingDetail.getText();
		BrowserUtility.waitFor(5);
		boolean description = text.contains("Billing Details");
		System.out.println(description);
		Assert.assertTrue(description);	
	}
	
	@Test(enabled=true)
	public void fillingBill17() throws ParseException {
		
		
		home.shop.click();
		home.home.click();
		List<WebElement> lists = home.threeArival;
		System.out.println(lists.size());
		Assert.assertEquals(3, lists.size());
		home.arrival1.click();
		String button = home.addToBasketButton.getText();
		Assert.assertEquals(button, "ADD TO BASKET");
		home.addToBasketButton.click();
		home.viewBasket.click();
		home.updateQuantity.clear();
		home.updateQuantity.sendKeys("13");
		home.updateBasket.click();

		BrowserUtility.waitFor(5);
		String subTotal = home.subTotal.getText();
		String newSubTotal = subTotal.substring(1);
		System.out.println(newSubTotal);
		
		String total = home.total.getText();
		String newTotal = total.substring(1);
		System.out.println(newTotal);
		
		NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		Number number1 = format.parse(newSubTotal);
		double num1 = number1.doubleValue();
		System.out.println(num1);
//		double num1 = Double.parseDouble(newSubTotal);
//		System.out.println(num1);
		Number number2 = format.parse(newTotal);
		double num2 = number2.doubleValue();
		System.out.println(num2);
//		double num2 = Double.parseDouble(newTotal);
//		System.out.println(num2);
		if(num2 > num1) {
			Assert.assertTrue(true);
			
		}else {
			Assert.assertFalse(false);
			
		}

		home.checkOutButton.click();
		String text = home.billingDetail.getText();
		BrowserUtility.waitFor(2);
		boolean description = text.contains("Billing Details");
		System.out.println(description);
		Assert.assertTrue(description);	
		home.nameInput.sendKeys("Yuki");
		home.lastNameInput.sendKeys("Ishikawa");
		home.emailInput.sendKeys("Ishikava@hotmail.com");
		home.phoneInput.sendKeys("7031231566");
//		home.countryInput.clear();
		home.countryInput.click();
		home.countrylist.sendKeys("United States", Keys.ENTER);
		home.addressInput.sendKeys("4351 Via dr");
		home.cityInput.sendKeys("Fairfax");
		//home.stateInput.click();
		home.state.click();
		
		home.stateInput.sendKeys("Thailand", Keys.ENTER);
		
		
		home.postcodeInput.sendKeys("22030");
		home.paymentMethod.click();
		home.placeOrederButton.click();
		
		BrowserUtility.waitFor(5);
		String bill = home.billDetail.getText();
		boolean s = bill.contains("Thank you. Your order has been received");
		System.out.println(bill);
		Assert.assertTrue(s);	
		
	}
	
	
	@AfterTest
	public static void afterTest() {
		
		Driver.closerDriver();
	}
}
