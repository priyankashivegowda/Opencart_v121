package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver driver;
	 public MyAccount(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	// @FindBy(xpath="(//a[normalize-space()='Logout'])[1]")
	// List<WebElement> alloption;
	 
	
	 @FindBy(xpath="//a[text()='Order History']")
	 WebElement orderhistory;
	 
	 @FindBy(xpath="//span[normalize-space()='My Account']")
	 WebElement myaccount;
		 
	 @FindBy(xpath="//li[@class='dropdown open']//li")
	 List<WebElement> alloptions;
		
	 @FindBy(xpath="//a[normalize-space()='Site Map']")
	 WebElement sitemap;
	 
	 @FindBy(xpath="//div[@class='col-sm-6']//a[normalize-space()='My Account']")
	 WebElement myaccountlink;
	 
	 @FindBy(xpath="//h2[normalize-space()='My Account']")
	 WebElement MyAccount;
	 
	 @FindBy(xpath="//li[@class='dropdown open']//li")
	 List<WebElement> secotimcl_myacc;
	public void first_myacc() 
	{
		myaccount.click();
	}
	public void my_account()
	{
		MyAccount.click();
	}
	public void order_history()
	{
		orderhistory.click();
	}
	
	public  void myacc_drpdo()
		{
			
		    System.out.println("total number of options:" + alloptions.size());
			for(WebElement option:alloptions)
			{
				if(option.getText().equals("Order History"))
				{
					option.click();
					break;
				}
				
			}
		}
	public void site_map()
	{
		sitemap.click();
	}
	
	public void myacc_link()
	{
		myaccountlink.click();
	}
	
	public boolean ispageexist()
	{
		try
		{
			return(MyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public  void log_out()
	{
		for(WebElement options:secotimcl_myacc)
		{
			if(options.getText().equals("Logout"))
			{
				options .click();
				break;
			}
			
		}
	}
	

			
	 

}
