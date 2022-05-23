package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(xpath = "//button[@name = 'EUR']")
	private WebElement euro;
	
	@FindBy(xpath="//strong[text()='€']")
	private WebElement euroSign;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsTab;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;
	
	public boolean isLogoDisplayed() {
		if(logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnCurrency() {
		currency.click();
	}
	
	public void clickOnEuro() {
		euro.click();
	}
	
	public boolean isEuroSignDisplayed() {
		if(euroSign.isDisplayed()) 
			return true;
		else
			return false;		
	
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public void clickOnLaptopsTab() {
		laptopsTab.click();
	}
	
	public void clickOnShowAllLaptops() {
		showAllLaptops.click();
	}
	
	
}
