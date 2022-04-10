package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductCompare {
	
	WebDriver driver;
	
	public ProductCompare(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchtext;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;
	
	@FindBy(xpath="//button[3]")
	WebElement productcompare;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement sucessdisplay;
	
	@FindBy(xpath="//a[normalize-space()='product comparison']")
	WebElement productlink;
	
	
	
	
	public void search_text(String text)
	{
		searchtext.sendKeys(text);
	}
	
	public void search_button()
	{
		searchbutton.click();
	}
	
	public void product_compare()
	{
		productcompare.click();
	}
	
	public String success_message()
	{
		try
		{
			return (sucessdisplay.getText());
		}
		catch(Exception e)
    	{
    		return(e.getMessage());
    	}
	}
	
	public void productcomicon()
	{
		productlink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
