package testng;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class ScreenShotsFunction {
	
	WebDriver driver;    // create refrence
	
	@BeforeClass()
	public void OpenUrl() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver         // set path of geckodriver
	     driver = new FirefoxDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	     TakesScreenshot FBShot = (TakesScreenshot)driver;       // take the screen shot and cast it
	     File Src1 = FBShot.getScreenshotAs(OutputType.FILE);     // make it is a file type
	     //FileUtils.copyDirectory(Src1, new File("./ScreenShots/FacebookPage.png"));
	     FileUtils.copyFile(Src1, new File("./ScreenShots/FacebookPage.png"));
	}
	
}
