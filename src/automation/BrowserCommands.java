package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		///System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
	     WebDriver driver = new FirefoxDriver();
	     
	     //get method
	     
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	     
	     //get tittle method
	     
	     String pagetitle = driver.getTitle();
	     
	     System.out.println("Title of the current page is" +pagetitle);
	     
	     // get current Url
	     
	    String CurrentUrl = driver.getCurrentUrl();
	    System.out.println("Url of the current page is = " +CurrentUrl);
	     
	    
	    // get page source
	    
	   String PageSource = driver.getPageSource();
	   System.out.println("Page Source of the current page is = " +PageSource);
	   
	   
	   // Close command
	   
	   //driver.close();
	   
	   // Quit
	   
	  // driver.quit();
	   
	}
}
