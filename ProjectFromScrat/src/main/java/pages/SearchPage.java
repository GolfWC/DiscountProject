package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class SearchPage {

	public SearchPage() {
		PageFactory.initElements(Driver.getDriver(),this);
	
	}
	
	@FindBy (xpath = "//input[@id='global-enhancements-search-query']")
	public WebElement searchBox;
	
	@FindBy (xpath = "//span[@class='etsy-icon wt-nudge-b-1']")
	public WebElement searchButt;
	
	@FindBy (xpath = "//p[contains(text(),\"We couldn't find any results for ?\")]")
	public WebElement invalidText;
	
}
