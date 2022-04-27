package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
	WebDriver driver;
	
	public ShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement shoppingcart;
	
	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	WebElement drpselect;
	
	@FindBy(xpath="//input[@id='input-coupon']") 
	WebElement textbox;
	
	//2nd dropdown
	@FindBy(xpath="//a[normalize-space()='Estimate Shipping & Taxes']")
	WebElement shipi;
	
	@FindBy(id="input-country")
	WebElement select;
	
	@FindBy(name="zone_id")
	WebElement selectzone;
	
	@FindBy(name="postcode")
	WebElement postcode;
	
	@FindBy(xpath="//button[@id='button-quote']")
	WebElement getquote;
	
	@FindBy(xpath="//input[@name='shipping_method']")
	WebElement radio;
	
	@FindBy(xpath="//input[@id='button-shipping']")
	WebElement applyshipping;
	
	@FindBy(xpath="//a[normalize-space()='Use Gift Certificate']")
	WebElement gift;
	
	@FindBy(xpath="//input[@id='input-voucher']")
	WebElement giftcerti;
	
	@FindBy(xpath="//input[@value='Apply Gift Certificate']")
	WebElement applygc;
	
	@FindBy(xpath="//a[normalize-space()='Continue Shopping']")
	WebElement con_button;
	
	public void addtocart()
	{
		addcart.click();
	}
	public void shop_cart()
	{
		shoppingcart.click();
	}
	public void dropdown()
	{
		drpselect.click();
	}
	public void drptext(String text)
	{
		textbox.sendKeys(text);
	}
	public void drpdown2()
	{
		shipi.click();
	}
	public void select_list()
	{
		Select dropcountry=new Select(select);
		dropcountry.selectByVisibleText("Togo");
		
	}
	public void select_list2()
	{
		Select select_zone=new Select(selectzone);
		select_zone.selectByVisibleText("Kara");
	}
	public void select_text(String text)
	{
		postcode.sendKeys(text);
	}
	public void select_getquote()
	{
		getquote.click();
	}
	public void select_radio()
	{
		radio.click();
	}
	public void select_applyshipping()
	{
		applyshipping.click();
	}
	public void select_gift()
	{
		
		gift.click();
	}
	public void select_giftcertifi(String text)
	{
		giftcerti.sendKeys(text);
	}
	public void select_buttongc()
	{
		applygc.click();
	}
	public void cont_button()
	{
		con_button.click();
	}
	
	
	
	
	
	
	

}
