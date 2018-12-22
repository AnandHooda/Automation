package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClassProgram {
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		//System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
		
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.alltestingstuff.com/");
	    String StringName= driver.findElement(By.linkText("Capabilities in Selenium")).getText();
	    System.out.println(StringName);
	    
	    
       }
}
