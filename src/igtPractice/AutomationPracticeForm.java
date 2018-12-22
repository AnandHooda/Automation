package igtPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeForm {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // arguments//parameters
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Anand");
		driver.findElement(By.name("lastname")).sendKeys("Hooda");
		driver.findElement(By.xpath("//input[@value='Male']")).click();            // radio button
		driver.findElement(By.xpath("//input[@value='5']")).click();               // radio button
		driver.findElement(By.id("datepicker")).sendKeys("2018-01-10");
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();            // check box
        
       /* driver.findElement(By.linkText("Test File to Download")).click();
        driver.switchTo().alert().accept();*/
        
        driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();  
        
        
        Select continent = new Select(driver.findElement(By.id("continents")));     // Handle the static combo box
		continent.selectByIndex(3);
		
		Select seleniumCommands = new Select(driver.findElement(By.id("selenium_commands"))); // Handle the 2nd static box
		seleniumCommands.selectByIndex(4);
        
		//driver.findElement(By.id("submit")).click();                        // click on submit button
        //driver.findElement(By.xpath("//button[@name='submit']")).click();   // click on submit button 
        
	}

}
