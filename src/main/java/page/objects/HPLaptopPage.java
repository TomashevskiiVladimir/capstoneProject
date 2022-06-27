package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HPLaptopPage extends Base{
	public HPLaptopPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name = 'quantity']")
	private WebElement qty;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement buttonAddToCart;
	
	@FindBy(xpath="//div[text()='Success: You have added ']//a[text()='HP LP3065']")
	private WebElement hpSuccess;
	
	public void deleteAndFillQty() {
		qty.clear();
		qty.sendKeys("1");		
		
	}
	
	public void clickOnButtonAddToCart() {
		Actions action = new Actions(driver);
		action.click(buttonAddToCart).build().perform();
	}
	
	public boolean isHpSuccessDisplayed() {
		String actualHpSuccess = hpSuccess.getText();
		String expectedHpSuccess = "HP LP3065";
		if(hpSuccess.isDisplayed()&& actualHpSuccess.equals(expectedHpSuccess))
			return true;
		else
			return false;
	}

}
