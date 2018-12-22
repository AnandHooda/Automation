package junit;

import org.junit.Test;

public class SecondJunitProgramExplainExpected 
{
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExpectedWorking()
	{
		
		int[] myArray = new int[15];
		System.out.println(myArray[20]); 
	}
	
	@Test(timeout=10000) //   this timeout must be in milisecond
	public void TimeOutWorking()
	{
		
		
		System.out.println("Anand Hooda"); 
	}

}
 