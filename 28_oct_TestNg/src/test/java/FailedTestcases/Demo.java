package FailedTestcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void Test1() {

		System.out.println("Test 1");

		AssertJUnit.assertEquals(false, true); // pass

	}

	@Test
	public void Test2() {

		System.out.println("Test 2");
		AssertJUnit.assertEquals(false, false); // fail

	}

	@Test

	public void Test3() {

		System.out.println("Test 3");
		AssertJUnit.assertEquals(true, true); // pass

	}

}
