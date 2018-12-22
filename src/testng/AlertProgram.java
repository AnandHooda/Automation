package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertProgram {
	WebDriver driver;                   // Reference 
	
	@BeforeTest
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
	     driver = new FirefoxDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     driver.manage().window().maximize();
	}
	
	@Test
	public void WebBasedAlert() throws InterruptedException
	{
		driver.switchTo().frame(0);     // frame id here is zero because there is only one frame available 
        // this command will switch u
		String DragData = driver.findElement(By.id("draggable")).getText();      
		System.out.println(DragData);
		Thread.sleep(6000);
		
		Actions DandDrop = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		DandDrop.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Selectable")).click();
		
		
	}
	
}





