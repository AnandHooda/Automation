package testng;

//import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PromptAlert 
{
FirefoxDriver driver;                  // Reference 
	
	@BeforeClass
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
	     driver = new FirefoxDriver();
	     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	     driver.manage().window().maximize();
	}
	
	@Test
	public void PromptAlertExample() throws InterruptedException
	{
		//driver.findElement(By.te).click();
		Thread.sleep(3000);
		
		
	}
	
	@AfterClass
	
	public void Close()
	{
		//driver.close();
	}

}
