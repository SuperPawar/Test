package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum1 {

	@Parameters({"a","b"})
	@Test
	public void add(int a,int b) { //10 5
		
		int sum = a+b;  // 15
		System.out.println("Add of two numbers is-->"+sum);
	}
}
