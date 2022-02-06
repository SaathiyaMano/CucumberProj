package saucedemopageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class LoginPage extends Baseclass {

	WebDriver driver;
	 
    @FindBy(id = "user-name")
    public WebElement txt_userName;
 
    @FindBy(id = "password")
    public WebElement pw_password;
 
 
    @FindBy(id = "login-button")
    public  WebElement login;

    
    public void enterusername(String username) {
    	txt_userName.sendKeys(username);
    
	}
    
    public void enterpassword(String Password) {
    	pw_password.sendKeys(Password);
    
	}

    public void clickonlogin() {
    	login.click();	
    	
    }
    
    public LoginPage(WebDriver driver) {
    	 
        this.driver = driver;
        
        PageFactory.initElements(driver, LoginPage.class);
}
}
