package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Program1 {

	@Test(groups = "Smoke")

	public void Test1() {
		System.out.println("Program 1");
	}

	@Test(groups = "Smoke")

	public void Test2() {
		System.out.println("Program 2");
	}

	@Test(groups = "Regression")

	public void Test3() {
		System.out.println("Program 2");
	}
}
