package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {

	WebDriver driver;
	public  ProductDisplayPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory. initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement img;
	
	@FindBy(xpath="//a[normalize-space()='iMac']")
	WebElement product;
	
	@FindBy(xpath="//a[@href='#tab-review']")
	WebElement review;
	
	@FindBy(xpath="//button[@id='button-review']")
	WebElement conti;
	
	public void search_txt(String text)
	{
		searchtxt.sendKeys(text);
	}
	public void search_button()
	{
		searchbutton.click();
	}
	public void pro_img()
	{
		img.click();
	}
	public void pro_duct()
	{
		product.click();
	}
	public void produreview()
	{
		review.click();
	}
	
	public boolean isPageExists()
	{	
		try
		{
			return(conti.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
}
