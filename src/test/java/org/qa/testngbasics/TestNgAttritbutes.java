package org.qa.testngbasics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAttritbutes {

	@BeforeMethod
	public void methodb() {
		System.out.println("methodb");
	}

	@Test(priority = 0, groups = "TEST", invocationCount = 20, invocationTimeOut = 2000, expectedExceptions = ArithmeticException.class)
	public void test() {
		System.out.println("test");
		int i = 90 / 0;

	}

}
