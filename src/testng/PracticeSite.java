package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeSite {
	
	FirefoxDriver driver;                  // Reference 
	
	@Parameters({"Username","Password"})
	  @Test
	  public void test1() throws InterruptedException
	 {
	  Login("Mkumar","mukesh@93");
	 }
	 @Test
	 public void test2() throws InterruptedException
	 {
	  Login("Mkumarjha","mukesh@931");
	  
	 }
	  @BeforeMethod
	  public void common1()
	 {
		  System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver         // set path of geckodriver
		     driver = new FirefoxDriver();
			 driver.get("http://ct.uccpreconfig.fastbooking.ch/index.php");
	       
	 }
	  @AfterMethod
	  public void common2()
	 {
	  driver.quit();
	 }
	  
	  
	  
	  public void Login(String username, String password) throws InterruptedException
	 {
	 
	  WebElement user = driver.findElement(By.id("txtLoginID"));
	  user.sendKeys(username);
	  WebElement pass = driver.findElement(By.id("pwdKey"));
	  pass.sendKeys(password);
	  Select tool = new Select(driver.findElement(By.id("tool")));
	  tool.selectByVisibleText("Updater");
	  WebElement submit = driver.findElement(By.id("btnLogin"));
	  submit.click();
	  Thread.sleep(2000);
	  String expected = "Welcome";
	  WebElement check = driver.findElement(By.className("blackLink"));
	  String actual = check.getText();
	  if(actual.contains(expected))
	  {
	   System.out.println("Test is pass");
	  }
	  else
	  {
	   System.out.println("Test is fail");
	  }
	 }
}
	
