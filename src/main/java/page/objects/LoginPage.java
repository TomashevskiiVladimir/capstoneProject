package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email")
	private  WebElement emailTextBox;
	@FindBy(name ="password")
	private WebElement passwordTextBox;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	public void enterEmail() {
		emailTextBox.sendKeys("tomashevskiivladimir@gmail.com");
	}
	
	public void enterPassword() {
		passwordTextBox.sendKeys("01101992");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
