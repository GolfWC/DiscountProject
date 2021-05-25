package TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MyAccountPage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;

public class MyAccount {
	
	MyAccountPage account = new MyAccountPage();
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		BrowserUtility.waitForPageToLoad(3);
	}
	
	@Test(enabled=false)
	public  void myAccountDashbord() {
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		account.myAccountButton.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("golf_atomic@hotmail.com");
		account.username.sendKeys("golf_atomic@hotmail.com");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("4BSHH@G@CdDKFjZ");
		account.password.sendKeys("4BSHH@G@CdDKFjZ");
//		
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		account.login.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		account.myAccountButton.click();
		
		
//		String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("dashbord"))).getText();
		String text = account.dashbordButton.getText();
		Assert.assertEquals(text, "Dashboard");
		
	}
	@Test(enabled=true)
	public void myAccountOrder() {
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		account.myAccountButton.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("golf_atomic@hotmail.com");
		account.username.sendKeys("golf_atomic@hotmail.com");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("4BSHH@G@CdDKFjZ");
		account.password.sendKeys("4BSHH@G@CdDKFjZ");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		account.login.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		account.myAccountButton.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("order"))).click();
		account.order.click();
		
//		String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("orderMessage"))).getText();
		String text = account.orderMessage.getText();
		boolean message = text.contains("No order has been made yet.");
		Assert.assertTrue(message);
		
	}
	
	@AfterTest
	public void afterTest() {
		
		Driver.closerDriver();
	}
}
