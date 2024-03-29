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

	@FindBy (xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccountButton;
	
	@FindBy (xpath="//a[contains(text(),'Shop')]")
	public WebElement shop;
	
	@FindBy (xpath = "//a[contains(text(),'Home')]")
	public WebElement home;
	
	@FindBy (xpath = "//div[@class='n2-ss-slider-3']/div")
	public List<WebElement> slider;
	
	@FindBy (xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
	public List<WebElement> threeArival;
	
	@FindBy (xpath = "(//div[@class='woocommerce']/ul/li/a/img)[1]")
	public WebElement arrival1;
	
	@FindBy (xpath = "(//div[@class='woocommerce']/ul/li/a/img)[2]")
	public WebElement arrival2;
	
	@FindBy (xpath = "(//div[@class='woocommerce']/ul/li/a/img)[3]")
	public WebElement arrival3;
	
	@FindBy (xpath = "//button[contains(text(),'Add to basket')]")
	public WebElement addToBasketButton;
	
	@FindBy (xpath = "//a[contains(text(),'View Basket')]")
	public WebElement viewBasket;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/div[1]/input[1]")
	public WebElement quantity;
	
	@FindBy (xpath = "//div[@id='tab-description']")
	public WebElement productDescription;
	
	@FindBy (xpath ="//a[contains(text(),'Reviews (0)')]")
	public WebElement reviewTap; 
	
	@FindBy (xpath = "//h3[@id='reply-title']")
	public WebElement reviewText;
	
	@FindBy (xpath = "//input[@name='quantity']")
	public WebElement costomQuantity;
	
	@FindBy (xpath = "//a[contains(text(),'Proceed to Checkout')]")
	public WebElement checkOutButton;
	
	@FindBy (xpath = "//h3[contains(text(),'Billing Details')]")
	public WebElement billingDetail;
	
	@FindBy (xpath = "//a[contains(text(),'Click here to enter your code')]")
	public WebElement coupon;
	
	@FindBy (xpath = "//input[@id='coupon_code']")
	public WebElement couponCode;
	
	@FindBy (xpath = "//input[@name='apply_coupon']")
	public WebElement applyCouponButton;
	
	@FindBy (xpath = "//div[contains(text(),'Coupon code applied successfully.')]")
	public WebElement applyCouponText;
	
	@FindBy (xpath = "//ul[@class='woocommerce-error']/li")
	public WebElement applyCouponLimit;
	
	@FindBy (xpath = "//a[contains(text(),'�')]")
	public WebElement remove;
	
	@FindBy (xpath =  "//p[contains(text(),'Your basket is currently empty.')]")
			//"//p[contains(text(),'Your basket is currently empty.')]"
	public WebElement removeText;
	
	@FindBy (xpath = "//tbody/tr[2]/td[1]/input[1]")
	public WebElement updateBasket;
	
	@FindBy (xpath = "//div[@class='quantity']/input")
	public WebElement updateQuantity;
	
	@FindBy (xpath = "//tbody/tr[1]/td[1]/span[1]")
	public WebElement updatePrice;
	
	@FindBy (xpath = "//tbody/tr[1]/td[1]/span[1]")
	public WebElement subTotal;
	
	@FindBy (xpath = "//tbody/tr[3]/td[1]/strong[1]/span[1]")
	public WebElement total;
	
	@FindBy (xpath = "//input[@id='billing_first_name']")
	public WebElement nameInput;
	
	@FindBy (xpath = "//input[@id='billing_last_name']")
	public WebElement lastNameInput;
	
	@FindBy (xpath = "//input[@id='billing_email']")
	public WebElement emailInput;
	
	@FindBy (xpath = "//input[@id='billing_phone']")
	public WebElement phoneInput;
	
	@FindBy (xpath = "//div[@id='s2id_billing_country']")
	public WebElement countryInput;
	
	@FindBy (xpath = "//input[@id='s2id_autogen1_search']")
	public WebElement countrylist;
	// Actions action = new Actions;
	//action.selectByValue="US";
	
	
	@FindBy (xpath = "//input[@id='billing_address_1']")
	public WebElement addressInput;
	
	@FindBy (xpath = "//input[@id='billing_city']")
	public WebElement cityInput;
	
	@FindBy (id = "s2id_billing_state")
	public WebElement state;
	
	@FindBy (id = "s2id_autogen2_search")
	public WebElement stateInput;
	// Actions action = new Actions;
	//action.selectByValue="VA";
	@FindBy (xpath = "//input[@id='billing_postcode']")
	public WebElement postcodeInput;
	
	@FindBy (xpath = "//input[@id='payment_method_bacs']")
	public WebElement paymentMethod;
	
	@FindBy (xpath = "//input[@id='place_order']")
	public WebElement placeOrederButton;
	
	@FindBy (xpath = " //p[contains(text(),'Thank you. Your order has been received.')]")
	public WebElement billDetail;
	
}
