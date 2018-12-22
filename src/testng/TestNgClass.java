package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	
	
	@BeforeMethod()
	
	public void BeforeMethodUse()
	{
		System.out.println("Befor 4444444");
	}
	
     @AfterMethod()
	
	public void AfterMethodUse()
	{
		System.out.println("After 55555");
	}
	
	@BeforeTest
	
	public void BeforeTestUse()
	{
		System.out.println("Before Test Use");
	}
	
	
	@AfterTest
	
	public void AfterTestUse()
	{
		System.out.println("After Teat use");
	}
	
	
	@AfterClass
	
	public void AfterClassUse()
	{
		System.out.println("After Use class");
	}
	
	@Test
	public void FisrtMethod()
	{
		System.out.println("First Test Case");
	}
	
	@Test
	public void SecondMethod()
	{
		System.out.println("Second Test Case");
	}
	
	@BeforeClass
	 
	public void BeforeClassUse()
	{
		System.out.println("Before Class Use");
	}
	
	@Test
	public void ThirdMethod()
	{
		System.out.println("Third Test Case");
	}
	

}
