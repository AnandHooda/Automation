package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");             // to open the url on 
		
		// to find the tittle
	   String pageTitle = driver.getTitle();                    //  to get the title of the page
	   
	   System.out.println("Page title of facebook page is == " +pageTitle);
	   
	   int  length = driver.getTitle().length();                 //  to get the title length
	   System.out.println("Page title  length of facebook page is == " +length);
	   
	   String  getCurrentUrl = driver.getCurrentUrl();          //  to get the title Current Url
	    System.out.println("current url is == " +getCurrentUrl);
	   
	    int  getCurrentUrllength = driver.getCurrentUrl().length();   //  to get the current Url length
	    System.out.println("current url is == " +getCurrentUrllength);
	   
		String pageSource = driver.getPageSource();                   //  to get the current page Source
		System.out.println("current page view source  is == " +pageSource);
		
		int  sourceLength = driver.getPageSource().length();           //  to get the current page Source length
		System.out.println("current page view source length  is == " +sourceLength);
	
		driver.manage().window().maximize();                // to maximize the window Size
		
		
		//driver.close();                     		              // to close a single  browser window
		driver.quit();     										 // to close all  browser window
		
	
	}

}
