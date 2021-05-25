package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class MyAccountLoginPage {

	public MyAccountLoginPage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
		
	}
	
	@FindBy (xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccountButton;
	
	@FindBy (xpath="//input[@id='username']")
	public WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy (xpath = "//input[@name='login']")
	public WebElement login;
	
	@FindBy (xpath = "//a[contains(text(),'Sign out')]")
	public WebElement logout;
	
	@FindBy (xpath = "//div/div/div[@class='woocommerce-MyAccount-content']")
	public WebElement welcomeText;
	
	@FindBy (xpath ="//ul[@class ='woocommerce-error']")
	public WebElement errorText;
}
