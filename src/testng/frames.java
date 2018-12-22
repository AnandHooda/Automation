package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frames {
WebDriver driver;                  // Reference 
	

// in this program we do three things
//1) how to switch to iframe from main window
//2) how to do perform action on Iframe
//3) how to switch to the main window
	@BeforeTest
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
	     driver = new FirefoxDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}
	
	@Test
	public void Iframehandle() throws InterruptedException
	{
		
		driver.switchTo().frame(0);     // frame id here is zero because there is only one frame available 
		                                // this command will switch u
		String DragData = driver.findElement(By.id("draggable")).getText();      
		System.out.println(DragData);
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Selectable")).click();
	}

}
