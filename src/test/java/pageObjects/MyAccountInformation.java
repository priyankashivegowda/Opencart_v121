package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountInformation {
	WebDriver driver;
	 public MyAccountInformation(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath="//a[normalize-space()='Edit your account information']")
	 WebElement linkeditinform;
	 
	 @FindBy(xpath="//input[@id='input-firstname']")
	 WebElement firstname;
	 
	 @FindBy(xpath="//input[@id='input-lastname']")
	 WebElement lastname;
	 
	 @FindBy(xpath="//input[@id='input-email']")
	 WebElement email;
	 
	 @FindBy(xpath="//input[@id='input-telephone']")
	 WebElement telephone;
	 
	 @FindBy(xpath="//input[@value='Continue']")
	 WebElement conti;
	 
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	 WebElement successmes;

	
	 
	 public void editmyacc_information()
	 {
		 linkeditinform.click();
	 }
	 
	 public void first_name(String text)
	 {
		 firstname.clear();
		 firstname.sendKeys(text);
	 }
	 public void last_name(String text)
	 {
		 lastname.clear();
		 lastname.sendKeys(text);
	 }
	 public void e_mail(String text)
	 {
		 email.clear();
		 email.sendKeys(text);
	 }
	 public void tele_phone(String text)
	 {
		 telephone.clear();
		 telephone.sendKeys(text);
	 }
	 public void conti_nue()
	 {
		 conti.click();
	 }
	 public boolean success_message()
		{	
			try
			{
				return(successmes.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
	 

}
