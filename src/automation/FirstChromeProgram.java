package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstChromeProgram {
	
	//public static void main(String[] args)
	{
		// which browser we are going to use
		// open chrome browser
		// hit the url on chrome
		
		 System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");  // for mac only
		 
		 ///System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
		 
		 WebDriver driver = new ChromeDriver();   // create object of ChromeDriver
		 
	     driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 TakesScreenshot FBShot = (TakesScreenshot)driver;       // take the screen shot and cast it
	     File Src1 = FBShot.getScreenshotAs(OutputType.FILE);     // make it is a file type
	     //FileUtils.copyDirectory(Src1, new File("./ScreenShots/FacebookPage.png"));
	     try {
			FileUtils.copyFile(Src1, new File("./ScreenShots/FacebookPage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
