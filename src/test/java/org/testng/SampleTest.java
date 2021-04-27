package org.testng;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups = "smoke")
	private void tc0() {
		System.out.println("Method1");
	}

	@Test(groups = {"sanity","smoke"})
	private void tc1() {
		System.out.println("Method2");
	}

	@Test(groups = "smoke")

	private void tc2() {
		System.out.println("method3");
		
	}

	@Test(groups = "reg", dependsOnGroups = "smoke",alwaysRun=true)
	private void tc3() {
		System.out.println("method4");
	}

	@Test(groups = "smoke")
	private void tc4() {
		System.out.println("method5");
	}

}
