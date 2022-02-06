package saucedemopageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scenario2 extends LoginPage {

	public Scenario2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public WebElement cart_firstproduct;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	public WebElement shoppingtcartbutton;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	public WebElement Enlargeproduct;
	
	@FindBy(id="remove-sauce-labs-backpack")
	public WebElement Removeproduct;
	
	@FindBy(id="back-to-products")
	public WebElement Backtoproducts;
	
	
	public void firstproductaddtocart() {
		cart_firstproduct.click();
    
	}
	
	public void Shoppingcartbutton() {
		shoppingtcartbutton.click();
		
	}
	
	public void enlargeproduct() {
		Enlargeproduct.click();
		
	}
	
	public void removalproduct() {
		Removeproduct.click();
		
	}
	
	public void backtoproducts() {
		Backtoproducts.click();
		
	}
	
}
