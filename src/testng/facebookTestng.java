package testng;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebookTestng {
	
	WebDriver driver;    // create refrence
	@BeforeClass()
	public void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver         // set path of geckodriver
	     driver = new FirefoxDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	}
	
	@Test
	public void GetDateAndTime()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		 //get current date time with Date()
		 Date date = new Date();
       // Now format the date
		 String date1= dateFormat.format(date);

		 // Print the Date
		 System.out.println("Current date and time is " +date1);
		
	}
	
	
}



	
