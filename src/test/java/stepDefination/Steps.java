package stepDefination;

import org.openqa.selenium.WebDriver;

import com.Utilities.Browser;
import com.Utilities.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Loginpage;

public class Steps {
	static WebDriver driver;
	Loginpage login;
	PropertyReader reader;
	
	@Given("launch browser")
	public void launch_browser()  throws Exception 
	{
		reader=new PropertyReader("Data");
		//driver=Browser.openbrowser(reader.Getdata("browser"), reader.Getdata("driver"));
		driver=Browser.openbrowser(reader.Getdata("browser"));
		//Browser.openbrowser("Chrome");
	   
	}

	@Given("Enter Urls {string}")
	public void enter_urls(String url) 
	{
	    Browser.EnterUrl(url);
	}

	@Then("Enter user name {string}")
	public void enter_user_name(String user) 
	{
	    login=new Loginpage(driver);
	    
	    login.EnterUsername(user);

	}

	@Then("Enter password {string}")
	public void enter_password(String pass) 
	{
	   login.Enterpassword(pass);
	}

	@Then("Click on Login button")
	public void click_on_login_button() throws Exception 
	{
			login.clickOnloginbtn();  
			Thread.sleep(4000);
	}

	@Then("click on logout button")
	public void click_on_logout_button() 
	{
		
	   login.logOut();
	}

	@Then("closebrowser")
	public void closebrowser() 
	{
		Browser.closebrowser();
	    
	}

}
