package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.ProductCompare;
import pageObjects.ProductComparison2;
import testBase.BaseClass;

@Test
 public class Tc_006ProductCompare extends BaseClass 
 {
	
	public void test_productcompare() throws InterruptedException, IOException
	{
		logger.info("started Tc_006ProductCompare");
		
			try
			{
				driver.get(rb.getString("appURL"));
		
				Homepage hp=new Homepage(driver);
				logger.info("Home Page Displayed ");
		 
				driver.manage().window().maximize();
		 
				ProductCompare pc = new ProductCompare(driver);
				pc.search_text("iMac");
				Thread.sleep(3000);
				logger.info("enter product");
		 
				pc.search_button();
				Thread.sleep(3000);
				logger.info("product displayed on homepage");
			
				pc.product_compare();
				Thread.sleep(3000);
				logger.info("product comparing");
				
				String smessage=pc.success_message();
				//this is for only iMac as productsearch for other products search change subString number		
				if(smessage.substring(0,56).equals("Success: You have added iMac to your product comparison!"))
				{
					logger.info("sucess message displayed");
					Assert.assertTrue(true);
				}
				else
				{
					System.out.println("actual message "+smessage);
					logger.info("Message not displayed ");
					Assert.assertTrue(true);
				}
						
				pc.productcomicon();
				Thread.sleep(3000);
				
				ProductComparison2 pc2=new ProductComparison2(driver);
				
				boolean targetpage=pc2.isPageExist();
				
				if(targetpage)
				{
					logger.info("comparisonpage displayed");
					Assert.assertTrue(true);
				}
				else
				{
					logger.error("comparisonpage not displayed");
					Assert.assertTrue(false);
				}
			
				String item =pc2.checkitem();
				System.out.println("item name "+item);
			
				if(item.equals("iMac"))
				{
					logger.info("item details correct");
					Assert.assertTrue(true);
				}
				else
				{
					logger.error("item details not correct");
					captureScreen(driver,"test_productcompare");
					Assert.assertTrue(false);
				}
			}
			
			catch(Exception e)
			{
				logger.fatal("productcomparison failed");
				captureScreen(driver,"test_productcompare");
				Assert.fail();
			}
						
			logger.info("finished Tc_006ProductCompare");
	}
}
