package stepDefination.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemopageobject.LoginPage;

public class loginSepDefination extends Baseclass {
	
	WebDriver driver=null;
	LoginPage login_Demo;
	
	public void setdriver()
	{
		
		setup();
	}
	@Given("I visit {SaucedemoPage}")
	public void i_visit(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		openapplication();
	}
	@When("I enter {Username and Password} in the {username and password} field")
	public void i_enter_in_the_field(String username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		
		login_Demo=new LoginPage(driver);
		login_Demo.enterusername(username);
		login_Demo.enterusername(Password);
		
	    throw new io.cucumber.java.PendingException();
	}
	@When("I press the {click} button")
	public void i_press_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		login_Demo.clickonlogin();
		
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should see the {Home} page")
	public void i_should_see_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
