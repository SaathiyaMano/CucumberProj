package stepDefination.login;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import saucedemopageobject.Scenario2;

public class Scenario2step extends Scenario2{

	
	
	public Scenario2step(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver=null;
	Scenario2step Scenario1_step;
	
	@Given("user is successfully logged into Daucedemo page")
	public void user_is_successfully_logged_into_daucedemo_page() {
	    // Write code here that turns the phrase above into concrete actions
		openapplication();
		
	}

	@When("user is on Homepage")
	public void user_is_on_homepage(String username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		enterusername(username);
		enterusername(Password);
	}

	

	@When("user clicks on Add to cart option")
	public void user_clicks_on_add_to_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
		Scenario1_step.firstproductaddtocart();
	}

	@When("user clicks on Shopping Cart option")
	public void user_clicks_on_shopping_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
		Scenario1_step.Shoppingcartbutton();
	}

	@When("user clicks on {Sauce Labs Backpack}")
	public void user_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Scenario1_step.enlargeproduct();
	}

	@When("user clicks on remove button")
	public void user_clicks_on_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
		Scenario1_step.removalproduct();
	}

	@When("user clicks on back to products button")
	public void user_clicks_on_back_to_products_button() {
	    // Write code here that turns the phrase above into concrete actions
		Scenario1_step.backtoproducts();
	}
}
