package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class Tc_012MyAccount extends BaseClass {
	@Test
	public void test_myaccount() throws InterruptedException, IOException
	{
		logger.info("started Tc_012MyAccount");
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Homepage hp=new Homepage(driver);
		logger.info("homepage displayed");
		hp.clickMyAccount();
		logger.info("clicked on my account");
		Thread.sleep(2000);
		hp.clickLogin();
		logger.info("clicked on login");
		Thread.sleep(2000);
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		logger.info("entered email");
		Thread.sleep(3000);
		
		lp.setPassword(rb.getString("password"));
		logger.info("enter password");
		Thread.sleep(3000);
		
		lp.clickLogin();
		logger.info("click on login");
		
		MyAccount ma=new MyAccount(driver);
		ma.first_myacc();
		logger.info("click on my account dropdown");
		Thread.sleep(5000);
		
		ma.myacc_drpdo();
		logger.info("click on order history");
		Thread.sleep(3000);
		
		//ma.order_history();
		//Thread.sleep(5000);
		
		ma.site_map();
		logger.info("click on sitemap link below the page");
		Thread.sleep(5000);
		
		
		ma.myacc_link();
		logger.info("click on link small my account");
		Thread.sleep(5000);
		
		
		boolean tarpage=ma.ispageexist();
		if(tarpage)
		{
			logger.info("My Account page displayed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("My Account page not displayed");
			captureScreen(driver, "test_MyAccount");
			Assert.assertTrue(false);
		}
		
		ma.first_myacc();
		logger.info("click on myaccount dropdown ");
		ma.log_out();//logout not working
		logger.info("click on logout");
		
		
		
		
		
		
		
		
		
	}

}
