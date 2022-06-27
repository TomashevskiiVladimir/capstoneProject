package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.ShoppingCartPage;
import utilities.Util;

public class HomeStepDef extends Base{
	HomePage homePage = new HomePage();
	ShoppingCartPage cartPage = new ShoppingCartPage();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(homePage.isLogoDisplayed());
		logger.info("User is on the Home Page");
		Util.takeScreenShot(); 
	    
	}
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
		logger.info("User clicked on Currency");
		Util.takeScreenShot(); 
	}
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuro();
		logger.info("User chose Euro Currency");
		Util.takeScreenShot(); 
	    
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	    Assert.assertTrue(homePage.isEuroSignDisplayed());
	    logger.info("Currency value changed to Euro");
	    Util.takeScreenShot();
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	   homePage.clickOnShoppingCart();
	   logger.info("User clicked on shopping Cart");
	   Util.takeScreenShot(); 
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	    Assert.assertTrue(cartPage.isCartTextDisplayed());
	    logger.info(" “Your shopping cart is empty!” Message is displayed");
	    Util.takeScreenShot();
	}

}
