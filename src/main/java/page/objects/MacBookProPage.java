package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MacBookProPage extends Base{
	public MacBookProPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement priceTag;
	
	public boolean isPriceTagDisplayed() {
		String actualPriceTag=priceTag.getText();
		String expectedPriceTag = "$2,000.00";
		if(priceTag.isDisplayed()&&actualPriceTag.equals(expectedPriceTag))
			return true;
		else
			return false;
	}

}
