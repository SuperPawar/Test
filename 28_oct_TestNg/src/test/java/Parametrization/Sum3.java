package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum3 {

	@Parameters({"a","b"})
	@Test
	public void add(int a,int b) {
		
		int sum = a-b;
		System.out.println("Sub of two numbers -->"+sum);
	}
}
