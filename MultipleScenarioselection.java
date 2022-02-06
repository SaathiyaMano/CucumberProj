package stepDefination.login;

import org.openqa.selenium.WebDriver;

import base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RegistrationSuccess;
import saucedemopageobject.LoginPage;
import saucedemopageobject.MultipleScenarioSelection;

public class MultipleScenarioselection extends MultipleScenarioSelection {

	public MultipleScenarioselection(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	MultipleScenarioselection Multiscenario;
	
	WebDriver driver=null;
	
	
	public void setdriver()
	{
		
		setup();
	}
	
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

	@When("user selects product {string} and {string}")
	public void user_selects_product_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user clicks on Add to cart option")
	public void user_clicks_on_add_to_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
		Multiscenario.firstproductaddtocart();
		Multiscenario.secondproductaddtocart();
	}

	@When("clicks on shoppingcart")
	public void navigates_to_your_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		Multiscenario.clickonshoppingcart();
	}

	@When("user clicks on checkout option")
	public void user_clicks_on_checkout_option() {
	    // Write code here that turns the phrase above into concrete actions
		Multiscenario.clickoncheckout();
	}

	

	@Then("user enters {First name and LastName } in the {irst Name and Last name }field")
	public void user_enters_first_name_and_Lastname(String Firstname, String Lastname, String postcode) {
	    // Write code here that turns the phrase above into concrete actions
		
		Multiscenario =new MultipleScenarioselection(driver);
		Multiscenario.enterfirstname(Firstname);
		Multiscenario.enterlastname(Lastname);
		Multiscenario.enterpostalcode(postcode);
	}

	

	@Then("user clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		Multiscenario.clickoncontinuebutton();
	}

	

	@Then("user clicks on finish button")
	public void user_clicks_on_finish_button() {
	    // Write code here that turns the phrase above into concrete actions
		Multiscenario.clickonfinishbutton();
	}
}
