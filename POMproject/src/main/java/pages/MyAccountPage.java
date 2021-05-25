package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class MyAccountPage {

	public MyAccountPage() {
		
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
	
	@FindBy (xpath = "//a[contains(text(),'Dashboard')]")
	public WebElement dashbordButton;
	
	@FindBy (xpath ="//a[contains(text(),'Orders')]")
	public WebElement order;
	
	@FindBy (xpath ="//div[@class='woocommerce-MyAccount-content']//div")
	public WebElement orderMessage;
}
