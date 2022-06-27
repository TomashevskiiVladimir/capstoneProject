package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class CanonPage extends Base{
	public CanonPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewLink;
	
	@FindBy(xpath ="//input[@id='input-name']")
	private WebElement nameField;
	
	@FindBy(xpath ="//textarea[@id='input-review']")
	private WebElement reviewField;
	
	@FindBy(id ="input-option226")
	private WebElement colorDropDown;

	
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath="//div[contains(text(),' Thank')]")
	private WebElement thankYou;
	
	@FindBy(xpath = "//div[text()='Success: You have added ']//a[text()='Canon EOS 5D Camera']")
	private WebElement canonSuccess;
	
	public void clickOnReviewLink() {
		reviewLink.click();
	}
	

	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public boolean isThankYouDisplayed() {
		String actualThank = thankYou.getText();
		String expectedThank = "Thank you for your review. It has been submitted to the webmaster for approval.";
		if(thankYou.isDisplayed()&&actualThank.equals(expectedThank)) 
			return true;
		else
			return false;
		
	}
	
	public void fillNameField(String str) {
		nameField.sendKeys(str);
		
	}
	
	public void clickOnReviewField() {
		reviewField.click();
	}
	
	public void fillReviewField(String str2) {
		reviewField.sendKeys(str2);
	}
	
	
	
	public void createAndClickXpathForRate(String str3) {
		String rate = "//input[@type='radio' and  @value='"+str3+"']";
		 WebElement rating = driver.findElement(By.xpath(rate));
		rating.click();
	}
	
	public void selectColor() {
		Select select = new Select(colorDropDown);
		select.selectByValue("15");
	}
	
	public boolean isCanonSuccessDisplayed() {
		String actualCanonSuccess = canonSuccess.getText();
		String expectedCanonSuccess = "Canon EOS 5D Camera";
		if(canonSuccess.isDisplayed()&&actualCanonSuccess.equals(expectedCanonSuccess))
			return true;
		else
			return false;
					
	}
	
	
}

