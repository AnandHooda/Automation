package testng;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SSLCerification 
{
	@Test
	public void OpenUrl()
	{
		DesiredCapabilities ch = new DesiredCapabilities();  // DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions co = new ChromeOptions();
		co.merge(ch);
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");   // arguments//parameters
	     WebDriver driver = new ChromeDriver(co);
	     driver.get("https://jqueryui.com/droppable/");
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}
	
}
