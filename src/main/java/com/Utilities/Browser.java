package com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {
	public static  WebDriver driver;
	public static  WebDriver openbrowser(String browsername)
	   {
		   if (browsername.equalsIgnoreCase("Chrome"))
		   {
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver. manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   }
//		   else if(browsername.equalsIgnoreCase("edge"))
//		   {
//			   driver=new EdgeDriver();
//			   driver.manage().window().maximize();
//			   driver. manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		   }
		   else
		   {
			   driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			   driver. manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   }
		return driver;
		 
	   }
	
	   public static void EnterUrl(String url)
	   {
		   driver.get(url);
		//return driver;  	   
	   }
	   
	   public static  void closebrowser()
	   {
		   driver.close();
	   }

}
