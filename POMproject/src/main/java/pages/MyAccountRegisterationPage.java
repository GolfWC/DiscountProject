package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class MyAccountRegisterationPage {
	
	public MyAccountRegisterationPage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
		
	}
	
	@FindBy (xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccountButton;
	
	@FindBy (xpath="//input[@id='reg_email']")
	public WebElement registerName;
	
	@FindBy (xpath = "//input[@id='reg_password']")
	public WebElement registerPassword;
	
	@FindBy (xpath = "//input[@value='Register']")
	public WebElement registerButton;
	
	@FindBy (xpath = "//div[@class='page-content entry-content']/div/div")
	public WebElement welcomeText;
	
	@FindBy (xpath = "//ul[@class='woocommerce-error']/li")
	public WebElement errorText;
	
}
