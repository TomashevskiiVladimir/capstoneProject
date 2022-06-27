package step.definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CanonPage;
import page.objects.DesktopsPage;
import page.objects.HPLaptopPage;
import page.objects.HomePage;
import utilities.Util;

public class DesktopsStepDef extends Base{
	HomePage homePage = new HomePage();
	DesktopsPage desktopsPage = new DesktopsPage();
	CanonPage canonPage = new CanonPage();
	HPLaptopPage hPLaptopPage = new HPLaptopPage();
	//Test1
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		homePage.clickOnDesktopsTab();
		logger.info("User clicked on Desktops tab");
	    Util.takeScreenShot();
	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    homePage.clickOnShowAllDesktops();
	    logger.info("User clicked on Show all desktops");
	    Util.takeScreenShot();
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    List<WebElement> items = desktopsPage.elements();
	    for(WebElement element:items) {
	    	Assert.assertTrue(element.isDisplayed());
	    	logger.info(element.getAttribute("alt")+"is displayed");
	    	Util.takeScreenShot();
	    }
	    	
	}
	
	//test2
	@When("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	   desktopsPage.clickOnAddHpToCart();
	   logger.info("User clicked ADD TO CART option on ‘HP LP3065’ item");
	   Util.takeScreenShot();
	}
	@When("^User select quantity '1'$")
	public void user_select_quantity() {
	    hPLaptopPage.deleteAndFillQty();
	    logger.info("User selected quantity '1'");
	    Util.takeScreenShot();
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    hPLaptopPage.clickOnButtonAddToCart();
	    logger.info("User clicked add to Cart button");
	    Util.takeScreenShot();
	}
	
	@Then("^User should see a message Success: you have added HP LP '3065' to your Shopping cart!$")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
	    Assert.assertTrue(hPLaptopPage.isHpSuccessDisplayed());
	    logger.info("User was able to see a message Success: you have added HP LP '3065' to your Shopping cart!");
	    Util.takeScreenShot();
	
	}
	//Test 3
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    desktopsPage.clickOnAddToCartBtn();
	    logger.info("User clicked ADD TO CART option on ‘Canon EOS 5D’ item");
	    Util.takeScreenShot();
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	    canonPage.selectColor();
	    logger.info("User selected color from dropdown ‘Red’");
	    Util.takeScreenShot();
	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	    Assert.assertTrue(canonPage.isCanonSuccessDisplayed());
	    logger.info("User was able to see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’");
	    Util.takeScreenShot();
	}

    //Test4
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    desktopsPage.clickOnCanon();
	    logger.info("User clicked on Canon EOS 5D item");
	    Util.takeScreenShot();
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		canonPage.clickOnReviewLink();
		logger.info("User clicked on write a review link");
		Util.takeScreenShot();
	    
	}
	@When("user fill the review information : {string} ,{string},{string}")
	public void user_fill_the_review_information(String yourname, String yourReview, String Rating) {
		canonPage.fillNameField(yourname);
		canonPage.clickOnReviewField();
		canonPage.fillReviewField(yourReview);	
		canonPage.createAndClickXpathForRate(Rating);
		 logger.info("User filled all review information");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Util.takeScreenShot();
	
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	    canonPage.clickOnContinueButton();
	    logger.info("User clicked on Continue Button");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Util.takeScreenShot();
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	    Assert.assertTrue(canonPage.isThankYouDisplayed());
	    logger.info("User was able to see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.");
	    Util.takeScreenShot();
	}

	


}
