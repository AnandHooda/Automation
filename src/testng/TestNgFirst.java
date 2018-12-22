package testng;

import org.testng.annotations.Test;

public class TestNgFirst 
 {
	@Test(groups = {"First"})    // use annotation. it will be the starting point o your program
	public void FirstTestCase()   // Case 1
	{
 			System.out.println("First Test Case");
		}

	@Test
	public void SecondTestCase()     // Case 2
	{
 			System.out.println("Second Test Case");
		 }

	
}
