package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstractcomponents.basePage;

public class productCatalog extends basePage{

	public productCatalog(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css =".mb-3")
	List<WebElement> productlist;
	By toast=By.cssSelector(".mb-3");
	public List<WebElement> getproductlist()
	{
	return productlist;
	}
	
	
	
	public void addtocart(String productname) throws InterruptedException
	{
		for(WebElement product:productlist)
		{
	 String text=product.findElement(By.cssSelector("b")).getText();
			if(text.contains(productname))
			{
				product.findElement(By.cssSelector(".card-body button:last-of-type")).click();
			}
		
		}
		visibilityOfElementLocated(toast);
		Thread.sleep(3000);

	
}
}