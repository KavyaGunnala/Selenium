package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.basePage;

public class cartPage extends basePage{

	public cartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="/html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]/button")
	WebElement CartButton;
	
	public void addcart()
	{
		CartButton.click();
	}
}
