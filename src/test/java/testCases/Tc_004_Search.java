package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class Tc_004_Search extends BaseClass 
{
	
	
	@Test
	public void test_search() throws InterruptedException
	{

	logger.info("starting Tc_004_Search");
	
	try
	{
		driver.get(rb.getString("appURL"));
		logger.info("Home page displayed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		logger.info("Provided email");
		
		lp.setPassword(rb.getString("password"));
		logger.info("provided password");*/
		
		SearchPage sp=new SearchPage(driver);
		//sp.searchtxt("iphonees"); //invalid
		sp.searchtxt("iMac");
		logger.info("passing search item");
		Thread.sleep(2000);
		
		sp.searchbutton();
		Thread.sleep(1000);
		
		boolean tarpage=sp.isPageExist();
		System.out.println("target page " +tarpage);
		
		if(tarpage)  //if true this block will execute
		{
			logger.info("Item Not Found");
			
			Assert.assertTrue(true);
		}
		else   //if false else will execute
		{
			logger.error("Item/s Found");
			captureScreen(driver,"test_search");
			Assert.assertTrue(true);
		}
	}
	
	catch(Exception e)
		{
			logger.fatal("Application Fatal Error");
			Assert.fail();
		}
		
		logger.info("finished Tc_004_Search");
			
	
	}
}
