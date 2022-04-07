package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	//1.creating webdriver instance and constructor
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//2.locating elements
	@FindBy(name="search")
	WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement msgco;
	
	//3.corresponding actions
	
	public void searchtxt(String text)
	{
		searchtxt.sendKeys(text);
	}
	
	public void searchbutton()
	{
		searchbutton.click();
	}
	
	public boolean isPageExist()
	{
		try
		{
			return(msgco.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
	
	
	

}
