package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(tagName = "img")
	private List<WebElement> items;
	
	@FindBy(xpath="//img[@title='Canon EOS 5D Camera']")
	private WebElement canon;
	
	public List<WebElement>  elements() {
		List<WebElement> DesktopElements = items;
		return items;
	}
	@FindBy(xpath="//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement addHpToCart;
	
	@FindBy (xpath = "//button[@onclick=\"cart.add('30', '1');\"]")
	private WebElement canonAddToCartBtn;
	public void clickOnCanon() {
		canon.click();
	}
	
	public void clickOnAddHpToCart() {
		addHpToCart.click();
	}
	public void clickOnAddToCartBtn() {
		canonAddToCartBtn.click();
	}
	

}
