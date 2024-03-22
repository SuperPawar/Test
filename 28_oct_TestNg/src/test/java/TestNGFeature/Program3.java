package TestNGFeature;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Program3 {

	@Test(groups = "Regression")
	public void Test1() {
		System.out.println("Program 3");
	}
	
	@Test(groups = "Smoke")
	public void Test2() {
		System.out.println("Program 4");
		
		Assert.assertEquals(false, false);
	}
	
}
