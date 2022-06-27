package page.objects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Util;

public class AffiliateAccountPage extends Base {
	public AffiliateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@name='agree']")
	private WebElement aboutUs;
	
	@FindBy(id="input-company")
	private WebElement companyTextBox;
	
	@FindBy(name="website")
	private WebElement websiteTextBox;
	
	@FindBy(id="input-tax")
	private WebElement taxIdTextBox;
	
	@FindBy(xpath="//input[@value='cheque']")
	private  WebElement paymentMethod1;
	
	@FindBy(id="input-cheque")
	private WebElement inputChequeBox;
	
	@FindBy(xpath ="//div//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//div[text()= ' Success: Your account has been successfully updated.']")
	private WebElement textSuccess;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement bankNameBox;
	@FindBy(id="input-bank-branch-number")
	private WebElement branchNumber;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id ="input-bank-account-name")
	private WebElement accountName;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber;
	
	public void clickOnAboutUs() {
		aboutUs.click();
	}
	
	public void clickOnCompanyTextBox() {
		companyTextBox.click();
		
	}
	
	public void enterCompanyTextBox() {
		Random random = new Random();
		String companyName = "Company"+random.nextInt(100000000);
		companyTextBox.sendKeys(companyName);
	}
	
	public void clickOnWebsiteTextBox() {
		websiteTextBox.click();
		
	}
	
	public void enterWebsiteTextBox() {
		Random rand = new Random();
		String webName = "website"+rand.nextInt(100000000)+"@gmail.com";
		websiteTextBox.sendKeys(webName);
	}
	
	public void clickOnTaxIdTextBox() {
		taxIdTextBox.click();
		
	}
	
	public void enterTaxIdTextBox() {
		Random rando = new Random();
		taxIdTextBox.sendKeys(rando.nextInt(10000000)+"1");
	}
	
	public void clickOnPaymentMethod1() {
		paymentMethod1.click();
	}
	
	public void clickOnInputChequeBox() {
		inputChequeBox.click();
		
	}
	
	public void enterChequeBoxName() {
		Random random = new Random();
		String nameCheque = "name"+random.nextInt(1000000000);
		inputChequeBox.sendKeys(nameCheque);
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public boolean isTextSuccessdisplayed() {
		String actualTextSuccess = textSuccess.getText();
		String expectedTextSuccess = "Success: Your account has been successfully updated.";
		if(textSuccess.isDisplayed()&&actualTextSuccess.equals(expectedTextSuccess))
			return true;
		else
			return false;
	}
	
	public void clickOnBankTransfer() {
		bankTransfer.click();
	}
	
	public void clickOnBankName() {
		bankNameBox.click();
	}
	
	public void enterBankName(String Name) {
		bankNameBox.sendKeys(Name);
	}
	
	public void clickOnBranchNumber() {
		Util.clickElementWithJS(branchNumber);
	}
	
	public void enterBranch(String brNum) {
		Util.sendKeysWithJS("input-bank-branch-number", brNum);
	}
	
	public void clickOnSwiftCode() {
		swiftCode.click();
	}
	
	public void enterSwiftCode(String str) {
		swiftCode.sendKeys(str);
	}
	
	public void clickOnAccountName() {
		accountName.click();
	}
	
	public void enterAccountName(String str2) {
		accountName.sendKeys(str2);
	}
	public void clickOnAccountNumber() {
		accountNumber.click();
	}
	public void enterAccountNumber(String str3) {
		accountNumber.sendKeys(str3);
	}
	

}
