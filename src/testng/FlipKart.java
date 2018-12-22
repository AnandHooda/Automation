package testng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipKart 
{
	FirefoxDriver driver;                  // Reference 
	
	@BeforeClass
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
	     driver = new FirefoxDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();
	}
	
	@Test
	public void EnterDetail() throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		
		Alert alert = driver.switchTo().alert();
	    //driver.manage().timeouts().implicitlyWait(40, TimeUnit. SECONDS);
		
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		
	
		alert.accept();   // To click on the ok on alert
	}
	
	@AfterClass
	
	public void Close()
	{
		//driver.close();
	}
	

}
