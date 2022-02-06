package saucedemopageobject;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Sorting extends LoginPage{

	public Sorting(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	WebDriver driver;


	@FindBy(xpath="//[@class='product_sort_container']")
	public WebElement Sortingtheelement;

	
	public void Sortingoperation() {
		
		List<WebElement> price = driver.findElements(By.xpath("//[@class='product_sort_container']"));
		Select select = new Select(Sortingtheelement);
        select.selectByValue("Price (low to high)");

        List<String> prices = new ArrayList<String>();
        for (WebElement e : price)
        {
            prices.add(e.getText());
        }
        List<String> sortedPrices = new ArrayList<String>(prices);
        Collections.sort(sortedPrices);
        System.out.println(sortedPrices.equals(prices));

        assertEquals(prices, sortedPrices);
                  
	}
	
	
}
