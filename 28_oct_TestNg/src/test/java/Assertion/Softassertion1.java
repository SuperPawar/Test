package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion1 {

	
	@Test
	public  void Demo1() {
		
		SoftAssert soft  = new SoftAssert();
		
		System.out.println("Execution started");
		
		soft.assertTrue(false); 
		
		System.out.println("PC");
		
		soft.assertAll();
		
	//it collect the result of all assertion and in case if any failure mark the test case as failed.
	
	}
	
	@Test
	public void Demo2() {
		
		SoftAssert soft  = new SoftAssert();

		System.out.println("Execution started");
		
		soft.assertEquals("Welcome", "Welcome");  //fail
		
		soft.assertEquals(true, true); 
		
		System.out.println("Execution completd");
		
		soft.assertAll();
	}
	
}
