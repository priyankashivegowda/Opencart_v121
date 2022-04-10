package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparison2 {
	WebDriver driver;
    
    public ProductComparison2(WebDriver driver)
    {
  	  this.driver=driver;
  	  PageFactory.initElements(driver,this);
    }
    	//locating elements
    @FindBy(xpath="//h1[normalize-space()='Product Comparison']")
    WebElement pageexist;
    
    @FindBy(xpath="//tbody[1]/tr[1]/td[2]")
    WebElement itemexist;
    
    public boolean isPageExist()
	{
		try
		{
			return(pageexist.isDisplayed());
			
		}
		catch(Exception e)
		{
			return(false);
		}
	}
    
    public String checkitem()
    {
    	try
    	{
    		return (itemexist.getText());
    	}
    	catch(Exception e)
    	{
    		return(e.getMessage());
    	}
    }
    	
 }
