package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	WebDriver driver;
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement viewcart;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement shoppingcart;
	
	@FindBy(xpath="/a[@class='btn btn-primary']")
	WebElement checkout;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement msgconfirm;
	public void add_cart()
	{
		addcart.click();
	}
	public void view_cart()
	{
		viewcart.click();
	}
	public void shop_cart()
	{
		shoppingcart.click();
	}
	
	public void check_out()
	{
		checkout.click();
	}
	public boolean ispageexist()
	{
		try
		{
		return(msgconfirm.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
}
