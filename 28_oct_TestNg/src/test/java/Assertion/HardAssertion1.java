package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion1 {

	
	@Test
	public void Demo1() {
		
		System.out.println("Program started");  //1
		
		//AssertTrue
		Assert.assertTrue(true);  //
		
		System.out.println("Automation");  //2
		
		Assert.assertEquals("Automation", "Java");  //false  
		
		System.out.println("Execution completd");  
		
	}
	
	@Test
	public void Demo2() {
		
		Assert.assertFalse(false);  
		
		System.out.println("Ho Good evening");
		
		Assert.assertEquals("Java", "Java");
		
		System.out.println("PC");
	}
}
