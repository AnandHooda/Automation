package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigationCommands {
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.facebook.com/");  // browser naviation command
		
		driver.navigate().back();   // 2nd navigation command
		
		driver.navigate().forward();  //3rd navigation command
		
		driver.navigate().refresh();    // 4th navigation command 
		
		
	}

}

 // www.alltestingstuff.com


