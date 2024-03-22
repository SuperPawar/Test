package TestNGFeature;

import org.testng.annotations.Test;
import org.checkerframework.checker.units.qual.t;
import org.testng.annotations.Test;

public class Program2 {

	@Test(groups = "Regression")
	public void Test1() {
		System.out.println("Program 22");
	}
	@Test(groups = "Regression")
	public void Test2() {
		System.out.println("Program 23");
	}
	@Test(groups = "Smoke")
	public void Test3() {
		System.out.println("Program 33");
	}
}
