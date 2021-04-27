package org.adact;

import java.util.Date;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Adactin2 extends LibGlobal {
	@Parameters("browser")
	@Test
	private void tc_1(String name) {
		if (name.equalsIgnoreCase("Chrome")) {
			getChromeDriver();
			launchUlr("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("hijava");
			driver.findElement(By.id("pass")).sendKeys("javavaa");

		} else if (name.equalsIgnoreCase("FF")) {
			getFireFoxDriver();
			launchUlr("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("hijava");
			driver.findElement(By.id("pass")).sendKeys("javavaa");
		}

	}

}
