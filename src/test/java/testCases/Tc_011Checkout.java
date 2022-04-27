package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addcart;
import pageObjects.Checkout;
import pageObjects.Homepage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class Tc_011Checkout extends BaseClass{
	@Test
	public void test_checkout() throws InterruptedException
	{
		try
		{
		logger.info("starting test Tc_Checkout");
		driver.get(rb.getString("appURL"));
		Homepage hp= new Homepage(driver);
		logger.info("homepage is displayed");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SearchPage sp= new SearchPage(driver);
		sp.searchtxt("iMac");
		sp.searchbutton();
		Thread.sleep(3000);
	
		
		Checkout co=new Checkout(driver);
		co.add_cart();
		Thread.sleep(3000);
		co.view_cart();
		Thread.sleep(5000);
		co.shop_cart();
		Thread.sleep(5000);
		
		boolean targetpage=co.ispageexist();
		if(targetpage)
		{
			logger.info("checkout failed");
			captureScreen(driver, "test_checkout");
			Assert.assertTrue(false);
		}
		else
		{
			logger.error("checkout success");
			Assert.assertTrue(true);
		}
	}
	catch(Exception e)
	{
		logger.fatal("checkout failed");
		Assert.fail();
	}
	logger.info("finished test Checkout");
		
	}	
}
	
	


