package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Expectedcondition {

	@Test(expectedExceptions = NullPointerException.class)
	public void name() throws InterruptedException {
		
		System.out.println("Hi");
		
	//	Thread.sleep(4000);
		
		int no =10/0;  //14
//		try {
//		
//			
//			int no =10/0;
//
//		} catch (Exception e) {
//
//		}
		
		System.out.println("hello");
	}
}
