package testng;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TmeAndDate 
{
WebDriver driver;

@Test
public void GetDateAndTime()
{
	DateFormat formatdate= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
	 Date systemDate = new Date();
	 
	 String dateofSystem = formatdate.format(systemDate);
	 
	 System.out.println(dateofSystem);
}

} 


