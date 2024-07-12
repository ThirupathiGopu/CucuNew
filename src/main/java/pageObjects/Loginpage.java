package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//input[@type='email']")
   @CacheLookup
   WebElement usernamel;
	
   @FindBy(xpath="//input[@id='Password']")
   @CacheLookup
   WebElement passwordl;
	
   @FindBy(xpath="//button[text()='Log in']")
   @CacheLookup
   WebElement loginbuttonl;
   
   @FindBy(xpath="//a[text()='Logout']")
   @CacheLookup
   WebElement logoutbtnl;
   
   
   public void EnterUsername(String username)
   {
	   usernamel.clear();
	   usernamel.sendKeys(username);
	   
   }
   public void Enterpassword(String pass)
   {
	   passwordl.clear();
	   passwordl.sendKeys(pass);
   }
   public void clickOnloginbtn()
   {
	   loginbuttonl.click();
   }
   public void logOut()
   {
	   logoutbtnl.click();
   }
   
	
	
}
