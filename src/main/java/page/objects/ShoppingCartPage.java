package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ShoppingCartPage extends Base {
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class ='row']/div/p")
	private WebElement cartText;
	
	public boolean isCartTextDisplayed() {
		String expectedCartText = "Your shopping cart is empty!";
		String actualCartText = cartText.getText();
		if(cartText.isDisplayed()&&actualCartText.equals(expectedCartText))
			return true;
		else
			return false;
	}

}
