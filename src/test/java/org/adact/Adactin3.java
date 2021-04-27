package org.adact;

import java.util.Date;
import org.testng.annotations.Test;

public class Adactin3  {

	@Test
	private void tc_1() {
		System.out.println("Method0");
		System.out.println(Thread.currentThread().getId());

	}
	

	@Test
	private void tc_2() {
		System.out.println("Method1");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc_3() {
		System.out.println("Method2");
		System.out.println(Thread.currentThread().getId());

	}
	

	@Test
	private void tc_4() {
		System.out.println("Method3");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc_5() {
		System.out.println("Method4");
		System.out.println(Thread.currentThread().getId());

	}
	
	

}
