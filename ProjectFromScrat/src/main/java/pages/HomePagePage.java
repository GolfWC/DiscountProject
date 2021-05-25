package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class HomePagePage {
	
public HomePagePage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
	}

	@FindBy (xpath="//span[@id='catnav-primary-link-10923']")
	public WebElement clothButton;
	
	@FindBy (xpath="//li [@data-node-id='10936']/span")
	public WebElement menLink;
	
	@FindBy (xpath = "//a[@id='catnav-l4-10938']")
	public WebElement shirtLink;
	
	@FindBy (xpath = "//span[@class='currency-value']")
	public List<WebElement> itemPrice;
	
	@FindBy (xpath = "//h3[@class='text-gray text-truncate mb-xs-0 text-body ']")
	public List<WebElement> productName;
	
	@FindBy (xpath ="//div[contains(text(),'Add to cart')]")
	public WebElement addToCartButton;
	
	@FindBy (xpath = "//select[@id='inventory-variation-select-0']")
	public WebElement sizeList;
	
	@FindBy (xpath = "//a[@data-selector]")
	public WebElement popUp;
	
	@FindBy (xpath = "//header/div[4]/nav[1]/ul[1]/li[2]/span[1]/a[1]")
	public WebElement cart;
}