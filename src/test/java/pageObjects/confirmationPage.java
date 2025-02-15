package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.basePage;

public class confirmationPage extends basePage{

	public confirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="tr[class*=inserted] td label")
	WebElement confirmation;
	
	public void confirmationtext()
	{
		String id=confirmation.getText();
		System.out.println(id);
	}
}
