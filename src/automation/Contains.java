package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver");  // for mac only
		 
		 ///System.setProperty("webdriver.chrome.driver", "/Anand Data/library/chromedriver.exe");  // for window
		 
		 WebDriver driver = new ChromeDriver();   // create object of ChromeDriver
		 
		driver.get("http://www.alltestingstuff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'View my complete profile')]")).click();
}
}
