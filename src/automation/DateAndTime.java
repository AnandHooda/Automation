package automation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime 
{
 public static void main(String[] args)
 {
	 DateFormat formatdate= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
	 Date systemDate = new Date();
	 
	 String dateofSystem = formatdate.format(systemDate);
	 
	 System.out.println(dateofSystem);
 }
}
