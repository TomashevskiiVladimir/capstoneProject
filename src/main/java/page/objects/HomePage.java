package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	
	public boolean isLogoDisplayed() {
		String actualLogo = logo.getText();
		String expectedlogo = "TEST ENVIRONMENT";
		if(logo.isDisplayed()&&actualLogo.equals(expectedlogo))
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
	 String actualEuro = euroSign.getText();
	 String expectedEuro = "€";
		if(euroSign.isDisplayed()&&actualEuro.equals(expectedEuro)) 
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
	
	public void clickOnDesktopsTab() {
		desktopsTab.click();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
		
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	
}
