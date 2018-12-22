package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationProgram 
{
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		//System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
		
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.restapitutorial.com/"); 
		driver.manage().window().maximize();
		
		driver.get("https://www.restapitutorial.com/lessons/restquicktips.html"); 
		
		driver.navigate().back();          //    Click on Backward button
		driver.navigate().forward();       //    Click on Forword Button
		driver.navigate().refresh();      //     to do the refresh
       }
}














//driver.navigate().to("https://www.facebook.com/");         // it work same as get method