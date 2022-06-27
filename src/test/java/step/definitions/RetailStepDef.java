package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AffiliateAccountPage;
import page.objects.HomePage;
import page.objects.LaptopsPage;
import page.objects.LoginPage;
import page.objects.MyAccountPage;
import utilities.Util;

public class RetailStepDef extends Base{
	HomePage  homePage = new HomePage();
	LoginPage  loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	AffiliateAccountPage affiliateAccountPage = new AffiliateAccountPage();

	
	//Background
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	    homePage.clickOnMyAccount();
	    logger.info("User clicked on MyAccount");
	    Util.takeScreenShot(); 
	}
	@When("User click on Login")
	public void user_click_on_login() {
	   homePage.clickOnLogin();
	   logger.info("User click on Login");
	   Util.takeScreenShot(); 
	}
	@When("User enter username ‘userName’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() {
	   loginPage.enterEmail();
	   loginPage.enterPassword();
	   logger.info("User entered username ‘userName’ and password 'password’");
	   Util.takeScreenShot(); 
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
	    loginPage.clickOnLoginButton();
	    logger.info("User clicked on Login button");
	    Util.takeScreenShot(); 
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	    Assert.assertTrue(myAccountPage.isMyAccountTextDisplayed());
	    logger.info("User was able to log in to MyAccount dashboard");
	    Util.takeScreenShot(); 
	}
	//Test1
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		myAccountPage.clickOnAffiliateAccount();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link");
		Util.takeScreenShot();
	    
	}
	@When("User fill affiliate form with below information: company,website,taxID,paymentMethod")
	public void user_fill_affiliate_form_with_below_information_company_website_tax_id_payment_method() {
		affiliateAccountPage.clickOnCompanyTextBox();
		affiliateAccountPage.enterCompanyTextBox();
		affiliateAccountPage.clickOnWebsiteTextBox();
		affiliateAccountPage.enterWebsiteTextBox();
		affiliateAccountPage.clickOnTaxIdTextBox();
		affiliateAccountPage.enterTaxIdTextBox();
		affiliateAccountPage.clickOnInputChequeBox();
		affiliateAccountPage.enterChequeBoxName();
		logger.info("User filled affiliate form ");
		Util.takeScreenShot();
	   
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
	    affiliateAccountPage.clickOnAboutUs();
	    logger.info("User check on About us check box");
	    Util.takeScreenShot();
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    affiliateAccountPage.clickOnContinueButton();
	    logger.info("User clicked on Continue button");
	    Util.takeScreenShot();
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    Assert.assertTrue(affiliateAccountPage.isTextSuccessdisplayed());
	    logger.info("User was able to see a success message");
	    Util.takeScreenShot();
	}
	  
	
	//TEST2
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	   myAccountPage.clickOnEditAffiliateAccount();
	   logger.info("User clicked on ‘Edit your affiliate informationlink");
	   Util.takeScreenShot(); 
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    affiliateAccountPage.clickOnBankTransfer();
	    logger.info("user clicked on Bank Transfer radio button");
	    Util.takeScreenShot(); 
	}
	@When("User fill Bank information with below information {string},{string},{string},{string},{string}")
	public void user_fill_bank_information_with_below_information(String bankName, String abaNumber, String swiftCode, String accountName, String accountNumber) {
	    affiliateAccountPage.clickOnBankName();
	   affiliateAccountPage.enterBankName(bankName);
	   affiliateAccountPage.clickOnBranchNumber();
	   affiliateAccountPage.enterBranch(abaNumber);
	   affiliateAccountPage.clickOnSwiftCode();
	   affiliateAccountPage.enterSwiftCode(swiftCode);
	   affiliateAccountPage.clickOnAccountName();
	   affiliateAccountPage.enterAccountName(accountName);
	   affiliateAccountPage.clickOnAccountNumber();
	   affiliateAccountPage.enterAccountNumber(accountNumber);
	   logger.info("User filled Bank information");
	   Util.takeScreenShot(); 
	}
	
	
	//TEST 3

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    myAccountPage.clickOnEditAccount();
	    logger.info("User clicked on ‘Edit your account information’ link");
	    Util.takeScreenShot(); 
	}
	@When("User modify below information: firstname,lastName,email,telephone")
	public void user_modify_below_information_firstname_last_name_email_telephone() {
	    myAccountPage.editFirstName();
	    myAccountPage.editLastName();
	    myAccountPage.editEmail();
	    myAccountPage.editTelephone();
	    logger.info("User modified below information: firstname,lastName,email,telephone");
	    Util.takeScreenShot(); 
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	    Assert.assertTrue(myAccountPage.isSuccessAlertDisplayed());
	    logger.info("User was able to see a message ‘Success: Your account has been successfully updated.’");
	    Util.takeScreenShot(); 
	}
	


}
