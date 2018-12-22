package automation;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleTravelerCalander {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.path2usa.com/travel-companions");
	    driver.manage().window().maximize();
	    
	
	    
	    
       //*******************Handle the arrival Date from Calendar*****************/
 
 
	    // You have to open the date window first
	    
	    driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
	    
	    // Second lets pick the month only. any month you want
	    
		   while(!driver.findElement(By.cssSelector("[class ='datepicker-days'] [class='datepicker-switch']")).getText().contains("December 2017"))
		   {
			   driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();  // click on change month button
		   }
	     
		     //  List<WebElement> dates = driver.findElements(By.className("day"));      // it will give you the date list
		        int count = driver.findElements(By.className("day")).size();          // count that how many index are available
		        		for(int i=0;i<count;i++)
				       {
				    	       String textget =  driver.findElements(By.className("day")).get(i).getText();  // get the value on every index
		    	       
				    	       if(textget.equalsIgnoreCase("24"))
				    	       {
				    	    	   driver.findElements(By.className("day")).get(i).click();
				    	    	   break;
				    	       }    
    	       
		       }
	 
	
		}

	}
