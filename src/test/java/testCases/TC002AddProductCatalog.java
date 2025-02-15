package testCases;

import org.testng.annotations.Test;

//import jdk.internal.org.jline.utils.Log;
import pageObjects.loginPage;
import pageObjects.productCatalog;
import testBase.baseClass;

public class TC002AddProductCatalog extends baseClass{

	@Test()
	public void addproduct() throws InterruptedException
	{
		logger.info("starting addproduct testcase");
		loginPage lp=new loginPage(driver);
		lp.login(p.getProperty("username"), p.getProperty("password"));
		logger.info("logged into application");
		productCatalog pc=new productCatalog(driver);
		
		pc.getproductlist();
		logger.info("selected product");
		pc.addtocart(p.getProperty("productname"));
		logger.info("added tocart");
	}
}
