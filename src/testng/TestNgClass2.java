package testng;

import org.testng.annotations.Test;

public class TestNgClass2 {
	
	@Test(groups = {"First"})
	
	public void firstTestMethod()
	{
		System.out.println("Inside First Test Method");
	}

@Test
	
	public void secondTestMethod()
	{
		System.out.println("Inside second Test Method");
	}

@Test

public void thirdTestMethod()
{
	System.out.println("Inside third Test Method");
}
}
//(groups= {"First"})