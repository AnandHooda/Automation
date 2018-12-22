package testng;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaExecutor 
{
	WebDriver driver;
	@Test(enabled=false)
	public void ClickButton()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
	     driver = new FirefoxDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("document.getElementById('u_0_2').click()");  // this will click on login button
	}

@Test(enabled=false)
public void EnetrText()
{
	System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
    driver = new FirefoxDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("document.getElementById('email').setAttribute('value','ahhooda@gmail.com')");
}

@Test
public void GetandSetText()
{
	System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
    driver = new FirefoxDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("document.getElementById('email').setAttribute('value','ahhooda@gmail.com')");
    //String script = ()"return document.getElementByXPath('//span[@itemprop='telephone']').getText();"
    String TheTextIs = (String) js.executeScript("return document.getElementByXPath('//input[@type='password']').getText();");
    System.out.println(TheTextIs);
    
}

}

