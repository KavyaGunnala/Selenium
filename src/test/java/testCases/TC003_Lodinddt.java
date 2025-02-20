package testCases;

import org.testng.annotations.Test;

import pageObjects.loginPage;
import pageObjects.productCatalog;
import testBase.baseClass;
import utilities.DataProviders;

public class TC003_Lodinddt extends baseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="datadriven")
	public void ddtlogin(String uname,String pwd)
	{
		logger.info("Starting login ddt");
		loginPage lp=new loginPage(driver);
		lp.login(uname,pwd);
		logger.info("Entered username");
		productCatalog pc=new productCatalog(driver);
		pc.logoutbutton();
		logger.info("clicked on logout");
	}
	
	

}
