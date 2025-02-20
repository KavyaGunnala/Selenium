package testCases;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import jdk.internal.org.jline.utils.Log;
import pageObjects.loginPage;
import pageObjects.productCatalog;
import testBase.baseClass;

public class TC001_LoginTest extends baseClass{

	@Test(groups={"sanity","regression"},retryAnalyzer=utilities.Retry.class,dataProvider="jsondata")
	public void verifylogin(HashMap<String,String> input) throws InterruptedException
	{
		logger.info("Starting login testcase");
		loginPage lp=new loginPage(driver);
		lp.login(input.get("email"), input.get("password"));
		logger.info("Entered username and password");
		
		
		
	
	}

	@DataProvider
	 Object[][] jsondata()
	{
		List<HashMap<String, String>> data;
		try {
			data = getJsonDataToMap(".\\Selenium\\testData\\login.json");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
}
