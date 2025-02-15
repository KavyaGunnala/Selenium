package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.basePage;

public class orderPage extends basePage{

	public orderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy(xpath="//section/button[2]")
	WebElement countryselection;
	
	@FindBy(css="a[class*='submit']")
	WebElement placeorder;
	
	public void countrydropdown(String countrystring)
	{
		country.sendKeys(countrystring);
	}
	public void selection() {
		countryselection.click();
	}
	
	public void placeorderbutton()
	{
		placeorder.click();
	}
}
