package testCases;

import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.loginPage;
import pageObjects.productCatalog;
import testBase.baseClass;

public class TC001_LoginTest extends baseClass{

	@Test()
	public void verifylogin() throws InterruptedException
	{
		logger.info("Starting login testcase");
		loginPage lp=new loginPage(driver);
		lp.login("saanvi@gmail.com", "P@55word");
		logger.info("Entered username and password");
		
		
		
	
	}

	
}
