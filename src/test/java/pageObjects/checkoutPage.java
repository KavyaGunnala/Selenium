package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import abstractcomponents.basePage;

public class checkoutPage extends basePage {

	public checkoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(css=".cart h3")
List<WebElement> cartitems;
@FindBy(css=".totalRow button")
WebElement checkout;

public void viewcartitems(String productname)
{
	for(WebElement item: cartitems)
	{
		String cartitemname=item.getText();
		if(cartitemname.contains(productname))
		{
		
			
			Assert.assertTrue(true);
		}
		
	}
}
public void checkoutbutton()
{
	checkout.click();
}
}
