package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.Homepage;
import testBase.BaseClass;

public class Tc_009ForgotPassword extends BaseClass{
	
	@Test
	public void test_forgotpassword() throws InterruptedException  
	{
		logger.info("strarting Tc_009ForgotPassword");
		driver.get(rb.getString("appURL"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver.manage().deleteAllCookies(); 

		//System.setProperty.....
		WebDriver driver =new ChromeDriver(options);

		Homepage hp=new Homepage(driver);
		logger.info("homepage displayed");
		
		driver.manage().window().maximize();
		
		ForgotPassword fp=new ForgotPassword(driver);
		fp.clickMyAccount();
		logger.info("clicked on myaccount");
		
		fp.clickLogin();
		logger.info("clicked on login");
		
		fp.setEmail(rb.getString("email"));
		logger.info("provided email");
		
		fp.forgotpwd();
		Thread.sleep(3000);
		logger.info("clicked on forgot password");
		
		fp.femail("priyanka.shivegowda@gmail.com");
		Thread.sleep(3000);
		logger.info("provide confirmation email");
		
		fp.continuebutton();
		logger.info("finished Tc_009ForgoePassword");
		Thread.sleep(3000);
		
		
		
		
	}
	

}
