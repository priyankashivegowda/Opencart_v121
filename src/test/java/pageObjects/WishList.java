package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	
	WebDriver driver;
	
	public   WishList (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtext;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-heart'])[2]")
	WebElement wlist;
	
	@FindBy(xpath="//span[normalize-space()='Wish List (1)']")
	WebElement wlisticon;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement notfoun;
	
	
	
	
	public void search_text(String text)
	{
		searchtext.sendKeys(text);
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void addwlist()
	{
		wlist.click();
	}
	public void wlist_icon()
	{
		wlisticon.click();
	}
	
	public boolean ispageexist()
	{
		try
		{
			return(notfoun.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
}
