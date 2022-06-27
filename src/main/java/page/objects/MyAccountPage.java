package page.objects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MyAccountPage extends Base{
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myAccountText;
	
	@FindBy(xpath="//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccount;
	
	@FindBy(xpath="//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAccount;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccount;
	
	@FindBy(id="input-firstname")
	private WebElement fNameTxtBox;
	
	@FindBy(id="input-lastname")
	private WebElement lNameTxtBox;
	
	@FindBy(id="input-email")
	private WebElement emailTxtBox;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneTxtBox;
	
	@FindBy(xpath ="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successAlert;
	
	public boolean isMyAccountTextDisplayed() {
		String actualMyAccountText= myAccountText.getText();
		String expectedMyAccountText = "My Account";
		if(myAccountText.isDisplayed()&&actualMyAccountText.equals(expectedMyAccountText))
			return true;
		else
			return false;
	}
	
	public void clickOnAffiliateAccount() {
		affiliateAccount.click();
	}
	
	public void clickOnEditAccount() {
		Actions action = new Actions(driver);
		action.click(editAccount).build().perform();
	}
	
	public void editFirstName() {
		fNameTxtBox.click();
		fNameTxtBox.clear();
		fNameTxtBox.sendKeys("Boba");
	}
	
	public void editLastName() {
		lNameTxtBox.click();
		lNameTxtBox.clear();
		lNameTxtBox.sendKeys("Bull");
	}
	
	public void editEmail() {
		emailTxtBox.click();
		emailTxtBox.clear();
		emailTxtBox.sendKeys("tomashevskiivladimir@gmail.com");
	}
	
	public void editTelephone() {
		telephoneTxtBox.click();
		telephoneTxtBox.clear();
		Random random = new Random();
		String newPhone = "+1"+random.nextInt();
		telephoneTxtBox.sendKeys(newPhone);
	}
	
	public boolean isSuccessAlertDisplayed() {
		String actualSuccessAlert = successAlert.getText();
		String expectedSuccessAlert ="Success: Your account has been successfully updated.";
		if(successAlert.isDisplayed()&&actualSuccessAlert.equals(expectedSuccessAlert))
			return true;
		else
			return false;
	}
	
	public void clickOnEditAffiliateAccount() {
		editAffiliateAccount.click();
	}

}


