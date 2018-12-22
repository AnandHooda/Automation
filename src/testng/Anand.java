package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Anand 
{
WebDriver driver;
 
@Test
public void Amit()
{
	System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");   // arguments//parameters
    driver = new ChromeDriver();
	driver.get("https://www.google.com/"); 
	WebElement link = driver.findElement(By.linkText("Gmail"));
	
	Actions action = new Actions(driver);
	action.contextClick(link).perform();
	action.sendKeys("t").perform();
	
}
}
