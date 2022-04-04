package testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.Homepage;
import testBase.BaseClass;


public class Tc_001_AccountRegistration extends BaseClass {
	
	
	@Test(groups= {"regression","master"})
	public void test_account_Registration() throws IOException
	{
		logger.info(" Starting TC_001_AccountRegistration ");
		try
		{
		driver.get(rb.getString("appURL"));
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		Homepage hp=new Homepage(driver);
		
		hp.clickMyAccount();
		logger.info("click on My Account");
		
		hp.clickRegister();
		logger.info("clicked on Resister");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName("John");
		logger.info("Provided First Name");
		
		regpage.setLastName("Canedy");
		logger.info("Provided Last Name");
		
		regpage.setEmail(randomestring()+"@gmail.com");
		logger.info("Provided email");
		
		regpage.setTelephone("65656565");
		logger.info("Provided Telephone");
		
		regpage.setPassword("abcxyz");
		logger.info("Provided PassWord");
		
		regpage.setConfirmPassword("abcxyz");
		logger.info("Provided Confrmd Password");
		
		regpage.setPrivacyPolicy();
		logger.info("Set Privacy Policy");
		
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Account Registration Succes");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Account Registration failed");
			captureScreen(driver,"test_account_Registration");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			logger.fatal("Account Registration Failed");
			captureScreen(driver,"test_account_Registration");
			Assert.fail();
		}
		logger.info("Finished TC_001_AccountRegistration ");
		
	}
		
	
}