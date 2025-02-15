package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.basePage;

public class loginPage extends basePage{

	
	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="userEmail")
	WebElement Username;
	@FindBy(id="userPassword")
	WebElement Password;
	@FindBy(id="login")
	WebElement login;
	
	public void login(String uname,String pwd)
	{
	Username.sendKeys(uname);
	Password.sendKeys(pwd);
	login.click();
}
}