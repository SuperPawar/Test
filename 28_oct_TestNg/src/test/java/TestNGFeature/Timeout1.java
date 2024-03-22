package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Timeout1 {

	
	@Test(timeOut = 10000)
	public void LoginTest() {
		
		for(;;) {
			
			System.out.println("Hello");
		}
	}
}
