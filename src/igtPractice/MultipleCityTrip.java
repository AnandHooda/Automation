package igtPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCityTrip {
	
	public static void main(String[] args)
	   {
		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver         // set path of geckodriver
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://world.aeromexico.com/en/uk");
	     driver.manage().window().maximize();
	     
	    
	    driver.findElement(By.partialLinkText("Multi-city")).click();          // click on Multi City link
	    
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit. SECONDS);
	    driver.findElement(By.id("journey_MULTI_CITY_label")).click();            // click on Multi City radio button
	    
	    
//	    Boolean iselementpresent = driver.findElements(By.id("journey_MULTI_CITY_el")).size()!= 0;
//	    if (iselementpresent == true)
//	    {
//	     System.out.print("Hooda");
//	    }
	    
	    
	     
	    //******************Automation code for round on trip*******************//
	     
	     // handle the locations

	    
	    WebElement FlyingFrom1 = driver.findElement(By.id("origin_airport0"));
	    FlyingFrom1.click();

	     List<WebElement> adults = driver.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr/td/ul"));
	     System.out.println(adults.size());
	     for(WebElement adult:adults)
	     {

	      String adult1 = adult.getText();
	      System.out.println(adult1);
	      

	       if(adult1.equalsIgnoreCase("Aguascalientes (AGU)"))
	       {
	         adult.click();
	         break;
	       }
	     }
	    
	    
	     
	                             //***Departure Date*****/

	   

//	     driver.findElement(By.id("date0")).click();     // click on Departure box
//
//	      while(!driver.findElement(By.className("calheader")).getText().contains("March 2018"))     // Handle the  month
//   {
//	    	  System.out.println("Anand Hooda");
//	         driver.findElement(By.partialLinkText("Next Month")).click();
//	       }
//
//	                       // handle the Departure date
//	          
//	          int DepartureCount = driver.findElements(By.className("m2 calbody")).size();
//	          System.out.println(DepartureCount);
//	          
//	          for(int k=0;k<DepartureCount;k++)
//	           
//         {
//        
//	            String gettext=   driver.findElements(By.className("ui-state-default")).get(k).getText();
//	            if(gettext.equalsIgnoreCase("22"))
//	            {
//	              driver.findElements(By.className("ui-state-default")).get(k).click();
//	            }
//	            
//	            }
//
//	                         
//	     
//	     /************************* Handle the Number of Adults********************************************/
//	   
//	     
//	     WebElement Adult = driver.findElement(By.xpath("//div[@id='adultsF']"));
//	     Adult.click();
//
//	     List<WebElement> adults = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
//	   
//	     for(WebElement adult:adults)
//	     {
//
//	      String adult1 = adult.getText();
//
//	       if(adult1.equalsIgnoreCase("2 Adults"))
//	       {
//	         adult.click();
//	         break;
//	       }
//	     }
//	     
//	     //************************* Handle the Number of Child***********************************
//	      
//	     WebElement Children = driver.findElement(By.xpath("//div[@id='childrenF']"));
//	     Children.click();
//
//	     List<WebElement> childrens = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
//	   
//	     for(WebElement children:childrens)
//	     {
//
//	      String children2 = children.getText();
//
//	       if(children2.equalsIgnoreCase("2 Children"))
//	       {
//	        children.click();
//	         break;
//	       }
//	     }
//	     
//	     //************************* Handle the Number of Infant***********************************
//	     
//	     WebElement Infant = driver.findElement(By.xpath("//div[@id='infantsF']"));
//	     Infant.click();
//
//	     List<WebElement> infants = driver.findElements(By.xpath("//ul[@class='selector-class show']/li"));
//	   
//	     for(WebElement infant:infants)
//	     {
//
//	      String infant3 = infant.getText();
//
//	       if(infant3.equalsIgnoreCase("2 Infants"))
//	       {
//	        infant.click();
//	         break;
//	       }
//  }
//	     //*************   Click on Redeem Coupons*****************************/
//	     
//	     driver.findElement(By.linkText("Redeem your coupon")).click();
//	     
//	     
//	        //*******************************Click on Submit Button*********************/
//	    
//	     
//	               driver.findElement(By.cssSelector("input[value='Search Flights']")).click();
//	               
//	               
//	     
	 }

}
