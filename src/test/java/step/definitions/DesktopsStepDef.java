package step.definitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.HomePage;

public class DesktopsStepDef extends Base{
	HomePage homePage = new HomePage();
	DesktopsPage desktopsPage = new DesktopsPage();
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	    
	}
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	   
	}
	


}
