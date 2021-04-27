package org.adact;

import org.base.LibGlobal;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Adactin extends LibGlobal {

	@Disabled("no need")
	@Test
	public void method1() {
		System.out.println("Method 1");

	}

	
	@Test@DisplayName("<My Method>")
	public void method2() {
		System.out.println("Method 2");

	}

	@RepeatedTest(5)
	@Test
	public void method3() {
		System.out.println("Method 3");
	}

	@Test
	public void method4() {
		System.out.println("Method 4");

	}
}
