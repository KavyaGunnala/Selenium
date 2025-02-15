package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		FileReader fis=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(fis);
		logger=LogManager.getLogger(this.getClass());
		switch(br.toLowerCase())
		
		{
		case "chrome" : driver=new ChromeDriver();
		break;
		case "firefox" : driver=new FirefoxDriver();
		break;
		case "safari" : driver=new SafariDriver();
		break;
		case "edge" : driver=new EdgeDriver();
		break;
		default: System.out.println("Invalid browser name");return;
		}
		
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}
	@SuppressWarnings("deprecation")
	public String randomnumeric()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
public String randomalphanumeric()
{
	String generatedalpha=RandomStringUtils.randomAlphanumeric(10);
	return generatedalpha;
}
}
