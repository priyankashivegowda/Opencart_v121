package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class Tc_010ShoppingCart extends BaseClass {
	@Test
	public void test_ShoppingCart() throws InterruptedException
	{
		logger.info("started Tc_ShoppingCart");
		
		
			driver.get(rb.getString("appURL"));
			Thread.sleep(5000);
	 
		
		
			Homepage hp=new Homepage(driver);
			logger.info("homepage displayed");
			driver.manage().window().maximize();
			
		
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			SearchPage sp=new SearchPage(driver);
			sp.searchtxt("iMac");
			Thread.sleep(5000);
			logger.info("search iMac is displayed");
		
			sp.searchbutton();
			Thread.sleep(5000);
			logger.info("search button clicked");
		
			ShoppingCart sc=new ShoppingCart(driver);
			sc.addtocart();
			Thread.sleep(5000);
			logger.info("clicked on addtocart");
		
			sc.shop_cart();
			Thread.sleep(5000);
			logger.info("clicked on shopping cart");
		
			sc.dropdown();
			Thread.sleep(5000);
			logger.info("clicked on use coupon code dropdown");
		
			sc.drptext("EKm209");
			Thread.sleep(5000);
			logger.info("entered couponcode into text field");
		
			sc.drpdown2();
			Thread.sleep(5000);
			logger.info("clicked on estimate shipping and taxes");
		
			sc.select_list();
			Thread.sleep(5000);
			logger.info("selected country name in dropdown");
		
			sc.select_list2();
			logger.info("selected state");
		
			sc.select_text("573201");
			logger.info("entered postcode to a textfield");
		
			sc.select_getquote();
			logger.info("clicked on get quotes");
		
			sc.select_radio();
			logger.info("radio button selected");
		
			sc.select_applyshipping();
			logger.info("clicked on apply shipping");
		
			sc.select_gift();
			logger.info("clicked on use gift cetificates");
		
			sc.select_giftcertifi("X2D4B44");
			logger.info("entred gift certificate code");
		
			/*sc.select_buttongc();
			logger.info("clicked on apply gift certificate");*/
		
			sc.cont_button();
			logger.info("clicked on continue shopping");
		//not click on continue button some issue
		logger.info("finished Tc_010ShoppingCart");
		
		
		
	}
	

}
