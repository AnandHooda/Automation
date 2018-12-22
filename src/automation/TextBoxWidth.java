package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxWidth 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");  // for mac only
		 
		 ///System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
		 
		 WebDriver driver = new ChromeDriver();   // create object of ChromeDriver
		 
		driver.get("https://www.facebook.com/");
		
		int Width = driver.findElement(By.id("email")).getSize().getWidth();
		
		System.out.println(Width);
		 
		if(Width<9)
		{
			driver.findElement(By.id("email")).sendKeys("9876543210");
		}
		
		else
		{
			System.out.println("Please enter the correct phone no");
		}
}
}






