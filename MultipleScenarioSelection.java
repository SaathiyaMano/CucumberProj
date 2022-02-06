package saucedemopageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Baseclass;

public class MultipleScenarioSelection extends LoginPage{

	public MultipleScenarioSelection(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Products']")
	public WebElement title_name;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	public WebElement title_firstproduct;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public WebElement Addtocart_firstproduct;

	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement Addtocart_secondproduct;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	public WebElement shoppingtcartpage;
	
	@FindBy(id="checkout")
	public WebElement Checkout;
	
	
	@FindBy(id = "first-name")
    public WebElement txt_firstname;
 
    @FindBy(id = "last-name")
    public WebElement lastname;
 
 
    @FindBy(id = "postal-code")
    public  WebElement postalcode;
    
    @FindBy(id="continue")
    public  WebElement continuebutton;
    
    @FindBy(id="finish")
    public  WebElement finishbutton;
	
	public void firstproductaddtocart() {
		Addtocart_firstproduct.click();
    
	}
	
	
	public void secondproductaddtocart() {
		Addtocart_secondproduct.click();
    
	}
	
	public void clickonshoppingcart() {
		
		shoppingtcartpage.click();
	}
	
	public void clickoncheckout() {
		
		Checkout.click();
	}
	
	public void enterfirstname(String firstname) {
		txt_firstname.sendKeys(firstname);
		
	}
	
	public void enterlastname(String Lastname) {
		lastname.sendKeys(Lastname);
		
	}
	
	public void enterpostalcode(String postcode) {
		postalcode.sendKeys(postcode);
		
	}
	
	public void clickoncontinuebutton() {
		continuebutton.click();
		
	}
	public void clickonfinishbutton() {
		continuebutton.click();
		
	}
}
