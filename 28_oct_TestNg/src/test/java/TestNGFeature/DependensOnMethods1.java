package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependensOnMethods1 {

	@Test(priority = 1)
	public void LoginTest() {

		System.out.println("LoginTest");
		int no=10/0;
		System.out.println("Hello");
		
	}
	
	@Test(dependsOnMethods = "LoginTest",priority = 2)
	public void Homeopage() {
		System.out.println("Homepage");
	}

	@Test(dependsOnMethods = "LoginTest",priority = 3)
	public void Createnewaccounf() {
		System.out.println("Createnewaccounf");
	}

	@Test(dependsOnMethods = "LoginTest",priority = 4)
	public void Refreshpage() {
		System.out.println("Refreshpage");
	}

	
}
