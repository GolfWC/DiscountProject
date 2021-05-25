package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class ShopPage {
	
	public ShopPage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
		
	}
	
	@FindBy (xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccountButton;
	
	@FindBy (xpath="//a[contains(text(),'Shop')]")
	public WebElement shop;
	
	@FindBy (xpath = "//div[@class='price_slider_wrapper']/div/span")
	public WebElement filterAdjustLeft;
	
	@FindBy (xpath = "//div[@class='price_slider_wrapper']/div/span[2]")
	public WebElement filterAdjustRight;
	
	@FindBy (xpath = "//button[contains(text(),'Filter')]")
	public WebElement filterButton;
	
	@FindBy (xpath = "//a[contains(text(),'selenium')]")
	public WebElement seleniumButton;
	
	@FindBy (xpath ="//ul[@class='products masonry-done']/li/a/h3")
	public WebElement itemMessage;
	
	@FindBy (xpath = "//select[@name='orderby']")
	public WebElement sortItem;
	
	@FindBy (xpath = "//h3[contains(text(),'Thinking in HTML')]")
	public WebElement popItem;
	
	@FindBy (xpath = "//h3[contains(text(),'Android Quick Start Guide')]")
	public WebElement defaultItem;
	
	@FindBy (xpath = "//h3[contains(text(),'HTML5 WebApp Develpment')]")
	public WebElement newestItem;
	
	@FindBy (xpath = "//h3[contains(text(),'JS Data Structures and Algorithm')]")
	public WebElement lowPriceItems;
	
	@FindBy (xpath = "//h3[contains(text(),'Selenium Ruby')]")
	public WebElement hightPriceItem;
	
	@FindBy (xpath = "//select[@name='orderby']")
	public WebElement e;
	@FindBy (xpath = "//select[@name='orderby']")
	public WebElement f;
	@FindBy (xpath = "//select[@name='orderby']")
	public WebElement g;
	@FindBy (xpath = "//select[@name='orderby']")
	public WebElement h;
}