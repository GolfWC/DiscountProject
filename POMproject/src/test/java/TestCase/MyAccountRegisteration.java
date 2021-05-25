package TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.MyAccountRegisterationPage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;
import utility.ListernersTestNG;

@Listeners(ListernersTestNG.class)
public class MyAccountRegisteration {
	
	MyAccountRegisterationPage register = new MyAccountRegisterationPage();
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		BrowserUtility.waitForPageToLoad(3);
	}

	@Test(enabled=false)
	public void myAccountDashbord() {
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		register.myAccountButton.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerName"))).sendKeys("Igolf_atomic@hotmail.com");
		register.registerName.sendKeys("Igolf_atomic@hotmail.com");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerPassword"))).sendKeys("04BSHH@G@CdDKFjZ");
		register.registerPassword.sendKeys("04BSHH@G@CdDKFjZ");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerButton"))).click();
		BrowserUtility.waitFor(5);
		register.registerButton.click();
//		
//		String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("welcomeText"))).getText();
		String text = register.welcomeText.getText();
		boolean message = text.contains("From your account dashboard you can view your recent orders");
		Assert.assertTrue(message);
		
	}
	@Test(enabled=false)
	public  void myAccountOrder() {
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		register.myAccountButton.click();
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerName"))).sendKeys("golf_atomic.com");
		register.registerName.sendKeys("golf_atomic.com");
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerPassword"))).sendKeys("04BSHH@G@CdDKFjZ");
		register.registerPassword.sendKeys("04BSHH@G@CdDKFjZ");
		BrowserUtility.waitFor(5);
//		
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("registerButton"))).click();
		register.registerButton.click();
//		
//		String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("welcomeText"))).getText();
		String text = register.welcomeText.getText();
		boolean message = text.contains("From your account dashboard you can view your recent orders");
		Assert.assertTrue(message);
		
	}
	
	@Test(enabled = false)
	public void emthyEmail() {
		register.myAccountButton.click();
		register.registerName.sendKeys("");
		register.registerPassword.sendKeys("04BSHH@G@CdDKFjZ");
		BrowserUtility.waitFor(5);
		register.registerButton.click();
		String text = register.errorText.getText();
		boolean message = text.contains(" Please provide a valid email address.");
		Assert.assertTrue(message);
	}
	
	@Test(enabled = true)
	public void emthyPassword() {
		register.myAccountButton.click();
		register.registerName.sendKeys("golf@hotnail.com");
		
		BrowserUtility.waitFor(5);
		register.registerButton.click();
		String text = register.errorText.getText();
		boolean message = text.contains("Please enter an account password.");
		Assert.assertTrue(message);
	}
	
	@Test(enabled = true)
	public void emthyEmailPassword() {
		register.myAccountButton.click();
		
		
		BrowserUtility.waitFor(5);
		register.registerButton.click();
		String text = register.errorText.getText();
		boolean message = text.contains("Please provide a valid email address.");
		Assert.assertTrue(message);
	}
	@AfterTest
	public void afterTest() {
		
		Driver.closerDriver();
	}
}
