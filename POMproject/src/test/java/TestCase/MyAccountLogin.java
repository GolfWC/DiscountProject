package TestCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MyAccountLoginPage;
import utility.BrowserUtility;
import utility.ConficReader;
import utility.Driver;

public class MyAccountLogin {
	
	MyAccountLoginPage page = new MyAccountLoginPage();
	@BeforeMethod
	public void windowSetup() {
		
		Driver.getDriver().get(ConficReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		BrowserUtility.waitForPageToLoad(3);
	}

	@Test(enabled = true)
	public void loginValidUsernamePassword() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("golf_atomic@hotmail.com");
		page.username.sendKeys("golf_atomic@hotmail.com");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("4BSHH@G@CdDKFjZ");
		page.password.sendKeys("4BSHH@G@CdDKFjZ");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();
		Driver.getDriver().getWindowHandle();
	
		//String text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("welcomeText"))).getText();
		String text = page.welcomeText.getText();
		System.out.println(text);
		
		assertTrue(text.contains("Hello golf_atomic (not golf_atomic? Sign out)"));
		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("logout"))).click();
		
	}
	
	@Test(enabled = false)
	public  void incorrectUsernameAndPassword() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("Agolf_atomic@hotmail.com");
		page.username.sendKeys("Agolf_atomic@hotmail.com");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("A4BSHH@G@CdDKFjZ");
		page.password.sendKeys("A4BSHH@G@CdDKFjZ");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();
		
		//String actualText = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		String actualText = page.errorText.getText();
		System.out.println(actualText);
		String expectText = "Error: A user could not be found with this email address.";
		assertTrue(actualText.contains(expectText));
		
		
		
	}
	
	@Test(enabled = false)
	public void correctUsernameEmptyPassword() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("Agolf_atomic@hotmail.com");
		page.username.sendKeys("Agolf_atomic@hotmail.com");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();	
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		page.errorText.getText();
		//String actualText = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		String actualText =page.errorText.getText();
		System.out.println(actualText);
		String expectText = "Error: Password is required.";
		assertTrue(actualText.contains(expectText));
				
	}
	
	@Test(enabled=false)
	public void emptyUsernameValidPassword() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("A4BSHH@G@CdDKFjZ");
		page.password.sendKeys("A4BSHH@G@CdDKFjZ");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		page.errorText.getText();
		//String actualText = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		String actualText =page.errorText.getText();
		System.out.println(actualText);
		String expectText = "Error: Username is required.";
		assertTrue(actualText.contains(expectText));
				
	}
	
	@Test(enabled=false)
	public void emptyUsernameEmptyPassword() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();
		
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		page.errorText.getText();
		//String actualText = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		String actualText = page.errorText.getText();
		System.out.println(actualText);
		String expectText = "Error: Username is required.";
		assertTrue(actualText.contains(expectText));		
		
		
	}	
	
//	@Test(priority =5)
//	public static void loginPasswordMark() {
//		
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("MyAccount"))).click();
//		
//		Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
//		BrowserUtilities.waitFor(5);
//	
//		boolean text = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).isDisplayed();
//		
//		assertTrue(text);
//		Driver.closerBrowser();
//	}
//	
	@Test(enabled=false)
	public  void loginCasesensitive() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("myAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("Agolf_atomic@hotmail.com");
		page.username.sendKeys("Agolf_atomic@hotmail.com");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("A4BSHH@G@CdDKFjZ");
		page.password.sendKeys("A4BSHH@G@CdDKFjZ");
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();

		//String actualText = Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("errorText"))).getText();
		String actualText = page.errorText.getText();
		System.out.println(actualText);
		String expectText = "Error: A user could not be found with this email address.";
		assertTrue(actualText.contains(expectText));
		
	}
	
	@Test(enabled=false)
	public void authenrization() {
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("MyAccount"))).click();
		page.myAccountButton.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("username"))).sendKeys("golf_atomic@hotmail.com");
		page.username.sendKeys("golf_atomic@hotmail.com");
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("password"))).sendKeys("4BSHH@G@CdDKFjZ");
		page.password.sendKeys("4BSHH@G@CdDKFjZ");
		
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("login"))).click();
		page.login.click();
		//Driver.getDriver().findElement(By.xpath(ConficReader.getProperty("logout"))).click();
		page.logout.click();
		
	}
	
	@AfterTest
	public static void afterTest() {
		
		Driver.closerDriver();
	}
}
