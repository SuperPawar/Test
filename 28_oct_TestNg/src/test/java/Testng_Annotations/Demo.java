package Testng_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

// Execution sequence of annotations

//1.@Before suite
//2.@Before Test
//3.@Before Class
//4.@Before method
//@Test
//5.@After method
//6.@After class
//7.@After Test
//8.@After Suite
	
// in real time project we don;t need all these annotations we use @ Beofremethod @Aftermethod @Test, @bforeclass @After class
	// Precondition annotation
	@BeforeSuite
	public void Setup() {

		System.out.println("@BeforeSuite steup system config");
	}

	@BeforeMethod
	public void Launchbrowser() {
		System.out.println("@BeforeMethod -- Launchbrowser");
	}

	@BeforeTest
	public void LoginApp() {

		System.out.println("@Beforetest -- Login application ");
	}

	// Post Condition annotation

	@AfterSuite
	public void logout() {

		System.out.println("@Aftersuite -- Logout application");
	}

	@AfterClass
	public void closebrwoser() {
		System.out.println("@AfterClass - Cloase browser");
	}

	@AfterMethod
	public void deletecookies() {
		System.out.println("@Aftermethod -- Deletcookies");
	}

	@AfterTest
	public void logout1() {
		System.out.println("@Aftertest - logout1");
	}
	
	@Test
	public void facebookpage1() {
		System.out.println("@Test Facebook page 1");
	}
	
	@Test
	public void facebookpage2() {
		System.out.println("@Test Facebook page 2 ");
	}
	
	@BeforeClass
	public void URL() {

		System.out.println("@Beforeclass Enter URL");
	}
	
	@Test
	public void facebookpage3() {
		System.out.println("@Test Facebook page 3");
	}
	
}
