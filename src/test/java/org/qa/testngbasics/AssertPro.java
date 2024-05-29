package org.qa.testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPro {

	@Test
	public void test() {

		SoftAssert sa = new SoftAssert();
		System.out.println("M1");
		sa.assertEquals(false, true);
		System.out.println("M2");
		System.out.println("M3");
		sa.assertEquals(false, true);
		System.out.println("M4");
		System.out.println("M5");
		sa.assertEquals(false, true);
		System.out.println("M6");
		sa.assertAll();
	}

}
