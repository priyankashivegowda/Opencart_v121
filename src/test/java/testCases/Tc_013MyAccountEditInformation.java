package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountInformation;
import testBase.BaseClass;

public class Tc_013MyAccountEditInformation extends BaseClass{
	
	@Test
	public void tc_MyAccountInformation() throws InterruptedException
	{
		logger.info("strating Tc_013MyAccountEditInformation");
		try
		{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Homepage hp=new Homepage(driver);
		logger.info("homepage displayed");
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		Thread.sleep(5000);
		lp.setPassword(rb.getString("password"));
		
		lp.clickLogin();
		MyAccountInformation mi=new MyAccountInformation(driver);
		mi.editmyacc_information();
		Thread.sleep(5000);
		logger.info("clicked on edit myaccountinformation");
		
		/*mi.first_name("priya");
		Thread.sleep(5000);
		logger.info("provicaptureScreen(driver, "test_MyAccountInformation");ded firstname");
		
		mi.last_name("nka");
		Thread.sleep(5000);
		logger.info("provided lastname");
		
		mi.e_mail("physio@gmail.com");//emailid will be edited u hvae to use this email id for
										//login next time so i commented
		Thread.sleep(5000);
		logger.info("provided email");*/
		
		mi.tele_phone("254367892");
		Thread.sleep(5000);
		logger.info("telephone number");
		
		mi.conti_nue();
		Thread.sleep(5000);
		
		logger.info("clicked on continue button");
		boolean successmessage=mi.success_message();
				if(successmessage)
				{
					Assert.assertTrue(true);
					captureScreen(driver, "test_MyAccountInformation");
					logger.info("success message displayed");
				}
				else
				{
					Assert.assertTrue(false);
					captureScreen(driver, "test_MyAccountInformation");//capturing screen shot
					logger.info("success message not displayed");
				}
		}
		catch(Exception e)
		{
			logger.fatal("edit myaccount information failed");
			Assert.fail();
		}
		
	logger.info("finished Tc_013MyAccountEditInformation");
		
		
		
		
	}
	
	

}
