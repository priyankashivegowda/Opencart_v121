package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.WishList;
import testBase.BaseClass;


public class Tc_007WishList extends BaseClass{
	
	@Test
	public void test_wishlist() throws InterruptedException {
		logger.info("starting Tc_007WishList");
		try
		{
			driver.get(rb.getString("appURL"));
			Homepage hp=new Homepage(driver);
			logger.info("Homepage displayed");
			
			driver.manage().window().maximize();
			
			WishList wl=new WishList(driver);
			wl.search_text("iMac");
			Thread.sleep(3000);
			logger.info("enter any product name");
			
			wl.search_button();
			Thread.sleep(2000);
			
			boolean tarpage=wl.ispageexist();
			System.out.println("Item not found page: "+tarpage);
			
			if(tarpage)
			{
				logger.info("wishlist failed");
				Assert.assertTrue(false);
			}
			else
			{
				logger.error("search sucess");
				captureScreen(driver,"test_wishlist");//capturing screenshot
				Assert.assertTrue(true);
			}
			
			
			wl.addwlist();
			Thread.sleep(3000);
			
			wl.wlist_icon();
			Thread.sleep(2000);
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			logger.info("provided email");
			
			lp.setPassword(rb.getString("password"));
			logger.info("provided password");
			
			lp.clickLogin();
			logger.info("clicked on login");
			captureScreen(driver, "test_wishlist"); //capturing screenshot
			
		}
		catch(Exception e)
		{
			logger.fatal("Test case crashed");
			Assert.fail();
		}
		logger.info("finished Tc_007WishList");
			
		
	}

}
