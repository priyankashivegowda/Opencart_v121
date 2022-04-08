package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addcart;
import pageObjects.Homepage;
import testBase.BaseClass;

public class Tc_005AddCart extends BaseClass {
	
	@Test
	public void test_addcart() throws InterruptedException
	{
		logger.info("starting Tc_005AddCart");
		
		try
		{
			driver.get(rb.getString("appURL"));
			Homepage hp=new Homepage(driver);
			logger.info("homepage displayed");
			
			driver.manage().window().maximize();
			
			Addcart ac=new Addcart(driver);
			ac.search_text("iMac");
			Thread.sleep(3000);
			logger.info("enter any product");
			
			ac.search_button();
			Thread.sleep(3000);
			logger.info("product displayed on homepage");
			
			ac.addcart();
			Thread.sleep(3000);
			logger.info("product added to cart");
			
			ac.viewcart();
			Thread.sleep(3000);
			logger.info("product added to viewcart");
			
			ac.view();
			Thread.sleep(2000);
			logger.info("product added to view");
			
			
			String confmg=ac.getConfirmationMsg();
			
			if(confmg.equals("Success: You have added iMac to your shopping cart!"))
			{
				logger.info("searchpage is succes");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("addcart page failed");
				captureScreen(driver,"test_addcart");
				Assert.assertFalse(false);
			}
		}
		catch (Exception e)
		{
			logger.info("addcart failed");
			Assert.fail();
		}
			
		logger.info("Finished Tc_005AddCart");	
		
		
		
	}


		
	}
	


