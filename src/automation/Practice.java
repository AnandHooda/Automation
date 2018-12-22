package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");   // arguments//parameters
		
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://world.aeromexico.com/en/uk");
		 driver.manage().window().maximize();
	
	}

}
