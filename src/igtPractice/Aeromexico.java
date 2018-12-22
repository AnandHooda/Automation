package igtPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aeromexico {
	public static void main(String[] args)
	   {
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver         // set path of geckodriver
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://world.aeromexico.com/en/uk");
	     driver.manage().window().maximize();
	     
	     
	     driver.findElement(By.cssSelector("input[id='round']")).click();      // click on round on trip
	     //driver.findElement(By.cssSelector("input[id='one']")).click();     // click on single trip
	    // driver.findElement(By.linkText("Multi-city")).click();            // click on Multi City link
	    
	     
	    //******************Automation code for round on trip*******************//
	     
	     // handle the locations
	     
	    driver.findElement(By.id("from")).clear();
	    
	    WebElement departureWebElement = driver.findElement(By.id("from"));    //You can use xpath, ID or name whatever you like
	    departureWebElement.sendKeys("MXL");
	    departureWebElement.sendKeys(Keys.ENTER);
	    
	    
	    
	    WebElement ArrivalWebElement = driver.findElement(By.id("to"));    //You can use xpath, ID or name whatever you like
	    ArrivalWebElement.sendKeys("CGR");
	    ArrivalWebElement.sendKeys(Keys.ENTER);
	    
	    
	     
	                             //***Departure Date*****/

	   

	     driver.findElement(By.id("date-init")).click();     // click on Departure box

	      while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("February"))     // Handle the  month
      {
	         driver.findElement(By.linkText("Next")).click();
	       }

	                       // handle the Departure date
	          
	          int DepartureCount = driver.findElements(By.className("ui-state-default")).size();
	          
	          for(int i=0;i<DepartureCount;i++)
	           
            {
           
	            String gettext=   driver.findElements(By.className("ui-state-default")).get(i).getText();
	            if(gettext.equalsIgnoreCase("22"))
	            {
	              driver.findElements(By.className("ui-state-default")).get(i).click();
	            }
	            
	            }

	                         //********Arrival Date*****/

	    // Handle Arrival month

	        driver.findElement(By.id("date-end")).click();     // click on Arival box
	        driver.findElement(By.className("ui-datepicker-title")).getText();

	          while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("February"))     // Handle the  month
	          {
	             driver.findElement(By.linkText("Next")).click();	           }
	           
	       
	       
	       
	       // handle Arrival date
	       
	       int Arrivalcount = driver.findElements(By.className("ui-state-default")).size();
	       
	       for(int i=0;i<Arrivalcount;i++)
	        
	       {
	        
	          String gettext =   driver.findElements(By.className("ui-state-default")).get(i).getText();
	          if(gettext.equalsIgnoreCase("24"))
	           {
	             driver.findElements(By.className("ui-state-default")).get(i).click();
	           }
	        
	       }
	     
	     /************************* Handle the Number of Adults********************************************/
	   
	     
	     WebElement Adult = driver.findElement(By.xpath("//div[@id='adultsF']"));
	     Adult.click();

	     List<WebElement> adults = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
	   
	     for(WebElement adult:adults)
	     {

	      String adult1 = adult.getText();

	       if(adult1.equalsIgnoreCase("2 Adults"))
	       {
	         adult.click();
	         break;
	       }
	     }
	     
	     //************************* Handle the Number of Child***********************************
	      
	     WebElement Children = driver.findElement(By.xpath("//div[@id='childrenF']"));
	     Children.click();

	     List<WebElement> childrens = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
	   
	     for(WebElement children:childrens)
	     {

	      String children2 = children.getText();

	       if(children2.equalsIgnoreCase("2 Children"))
	       {
	        children.click();
	         break;
	       }
	     }
	     
	     //************************* Handle the Number of Infant***********************************
	     
	     WebElement Infant = driver.findElement(By.xpath("//div[@id='infantsF']"));
	     Infant.click();

	     List<WebElement> infants = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
	   
	     for(WebElement infant:infants)
	     {

	      String infant3 = infant.getText();

	       if(infant3.equalsIgnoreCase("2 Infants"))
	       {
	        infant.click();
	         break;
	       }
     }
	     //*************   Click on Redeem Coupons*****************************/
	     
	     driver.findElement(By.linkText("Redeem your coupon")).click();
	     
	     
	        //*******************************Click on Submit Button*********************/
	    
	     
	               driver.findElement(By.cssSelector("input[value='Search Flights']")).click();
	               
	               
	     
	 }
	}