package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.ProductDisplayPage;
import testBase.BaseClass;

public class Tc_008ProductDisplayPage extends BaseClass{
	
	@Test
	public void test_productdisplay() throws InterruptedException {
		logger.info("startes Tc_008ProductDisplayPage");
		
		try
		{
			driver.get(rb.getString("appURL"));
			Homepage hp=new Homepage(driver);
			logger.info("homepage displayed");
			
			driver.manage().window().maximize();
			
			ProductDisplayPage pd= new ProductDisplayPage(driver);
			pd.search_txt("iMac");
			Thread.sleep(3000);
			logger.info("enter any product");
			
			pd.search_button();
			Thread.sleep(2000);
			logger.info("click the search button");
			
			pd.pro_img();
			Thread.sleep(3000);
			logger.info("click on image");
			
			System.out.println("1");
			pd.pro_duct();
			Thread.sleep(3000);
			logger.info("click on product");
			
			System.out.println("2");
			
			pd.produreview();
			Thread.sleep(3000);
			logger.info("click on review");
			
			boolean tarpage=pd.isPageExists();
			if(tarpage)
			{
				logger.info("product displaypage success");
				
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("product displaypage failed");
				captureScreen(driver,"test_productdisplay");//capturing screenshot
				Assert.assertTrue(false);
			}
			
		}
		catch(Exception e)
		{
			logger.fatal("productdisplaypage failed");
			Assert.fail();
		}
		logger.info("finished Tc_008ProductDisplayPage");
		
	}

}
